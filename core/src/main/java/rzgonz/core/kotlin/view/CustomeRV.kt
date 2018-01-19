package rzgonz.core.kotlin.view

import android.content.Context
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.widget.GridLayoutManager


import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import rzgonz.core.kotlin.R
import rzgonz.core.kotlin.adapter.BaseRVAdapter
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.FrameLayout
import kotlinx.android.synthetic.main.custome_recycle_view.view.*
import kotlinx.android.synthetic.main.view_loading.view.*


/**
 * Created by rzgonz on 7/14/17.
 */
class CustomeRV @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyle: Int = 0
) : FrameLayout(context, attrs, defStyle), SwipeRefreshLayout.OnRefreshListener,View.OnClickListener,CellFooter.cellFooterCallback {

    private lateinit var recyclerAdapter: BaseRVAdapter
    private lateinit var listener: RVListener
    private var isLoading : Boolean = false

    init {
        LayoutInflater.from(context).inflate(R.layout.custome_recycle_view, this, true)
    }

    fun listener(rvListener: RVListener){
        listener = rvListener
        setAdapter(listener.initAdapter())
    }

    fun setLinearLayoutManager(layoutManager: LinearLayoutManager){
        rv.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,getAdapter().rvPropertise.reverseLayout)
    }

    fun setAdapter(adapter: BaseRVAdapter){
        recyclerAdapter = adapter
        rv.adapter = adapter
        rv.layoutManager = GridLayoutManager(context,adapter.colomCount,getAdapter().rvPropertise.orientation,false)
        swl.isEnabled = false
        if(adapter.rvPropertise.hasRefresh) {
            swl.isEnabled = true
            swl.setOnRefreshListener(this)
        }
        val emptyObserver = object : RecyclerView.AdapterDataObserver() {

            override fun onItemRangeChanged(positionStart: Int, itemCount: Int) {
                Log.e("AdapterDataObserver","onItemRangeChanged")
                super.onItemRangeChanged(positionStart, itemCount)
            }

            override fun onItemRangeRemoved(positionStart: Int, itemCount: Int) {
                Log.e("AdapterDataObserver","onItemRangeRemoved")
                super.onItemRangeRemoved(positionStart, itemCount)
            }
            override fun onChanged() {
                super.onChanged()
                //llLoading.visibility = View.INVISIBLE
            }

            override fun onItemRangeInserted(positionStart: Int, itemCount: Int) {
                super.onItemRangeInserted(positionStart, itemCount)
                Log.e("AdapterDataObserver","false")
                frameLoading.visibility = View.GONE
                if(adapter.rvPropertise.hasLoadmore) {
                    isLoading = false
                }
                if(adapter.rvPropertise.hasRefresh) {
                    swl.isRefreshing = false
                }
            }

        }

        recyclerAdapter.registerAdapterDataObserver(emptyObserver)

        listener.onLoadItems(adapter.rvPropertise.limit,adapter.rvPropertise.offset)

        (rv.layoutManager as GridLayoutManager).spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
            override fun getSpanSize(position: Int): Int {
                if(adapter.rvPropertise.hasHeadear){
                    if(position==0){
                        return adapter.rvPropertise.colomCount
                    }
                }

                if(adapter.rvPropertise.hasFooter){
                    if(position>=adapter.itemCount -1 &&adapter.hasLoadMore){
                        return adapter.rvPropertise.colomCount
                    }
                }

                return 1 // OTHER ITEMS OCCUPY ONLY A SINGLE SPACE
            }
        }




        rv.addOnScrollListener(object : RecyclerView.OnScrollListener(){

            override fun onScrollStateChanged(recyclerView: RecyclerView?, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
            }

            override fun onScrolled(recyclerView: RecyclerView?, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                val positionView = (rv.layoutManager as LinearLayoutManager).findLastVisibleItemPosition()
                Log.e("onScrolled"," "+rv.layoutManager.itemCount + "-->" + positionView + "--> "+ isLoading)
                if(rv.layoutManager.itemCount - 3 <= positionView)
                if(!isLoading&&adapter.rvPropertise.hasLoadmore){
                    isLoading = true
                    listener.onLoadItems(adapter.rvPropertise.limit, adapter.getItemsCount())
                }
            }
        })

        recyclerAdapter.setListener(this)
    }

    fun errorLoading(){
        swl.isRefreshing = false
        llLoading.visibility = View.INVISIBLE
        if(getAdapter().hasLoadMore){
            if(getAdapter().hasFooter){
                getAdapter().footerView?.errorLoading()
            }
        }else{
            view_reload.visibility = View.VISIBLE
            view_reload.setOnClickListener(this)
        }

    }

    fun getLayoutManager(): RecyclerView.LayoutManager? {
        return rv.layoutManager
    }

    fun getAdapter(): BaseRVAdapter {
       return recyclerAdapter
    }

    override fun onRefresh() {
        Log.d("onRefresh","false")
        isLoading = true
        frameLoading.visibility = View.VISIBLE
        llLoading.visibility = View.VISIBLE
        view_reload.visibility = View.GONE
        getAdapter().getItems().clear()
        getAdapter().notifyDataSetChanged()
        getAdapter().rvPropertise.offset = 0
        listener.onLoadItems(getAdapter().rvPropertise.limit, getAdapter().rvPropertise.offset)

    }

    override fun onReaload(position: Int) {
        Log.d("onReaload","error")
        listener.onLoadItems(getAdapter().rvPropertise.limit, position)
    }

    override fun onClick(p0: View?) {
        Log.d("onClick","refresh")
        onRefresh()
    }

    interface RVListener {
        fun initAdapter(): BaseRVAdapter
        fun onLoadItems(limit: Int, offset: Int)
        fun initRV() : CustomeRV
    }
}