package rzgonz.core.kotlin.view

import android.content.Context
import android.database.DataSetObservable
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.widget.GridLayoutManager


import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View

import android.widget.FrameLayout
import rzgonz.core.kotlin.R
import kotlinx.android.synthetic.main.custome_recycle_view.view.*
import rzgonz.core.kotlin.adapter.BaseRVAdapter
import java.util.ArrayList
import android.database.DataSetObserver
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.delay
import kotlin.coroutines.experimental.buildSequence


/**
 * Created by rzgonz on 7/14/17.
 */
class CustomeRV @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyle: Int = 0,
        defStyleRes: Int = 0
) : FrameLayout(context, attrs, defStyle, defStyleRes), SwipeRefreshLayout.OnRefreshListener,View.OnClickListener {

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
        rv.layoutManager = GridLayoutManager(context,adapter.colomCount)
        swl.isEnabled = false
        if(adapter.rvPropertise.hasRefresh) {
            swl.isEnabled = true
            swl.setOnRefreshListener(this)
        }
        listener.onLoadItems(adapter.rvPropertise.limit,adapter.rvPropertise.offset)

        (rv.layoutManager as GridLayoutManager).spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
            override fun getSpanSize(position: Int): Int {
                if(adapter.rvPropertise.hasHeadear){
                    if(position==0){
                        return adapter.rvPropertise.colomCount
                    }
                }

                if(adapter.rvPropertise.hasFooter){
                    if(position>adapter.getItems().size){
                        return adapter.rvPropertise.colomCount
                    }
                }

                return 1 // OTHER ITEMS OCCUPY ONLY A SINGLE SPACE
            }
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
                Log.e("AdapterDataObserver","onChanged")
            }

            override fun onItemRangeInserted(positionStart: Int, itemCount: Int) {
                super.onItemRangeInserted(positionStart, itemCount)
                Log.e("AdapterDataObserver","false")
                if(adapter.rvPropertise.hasLoadmore) {
                        isLoading = false
                }
                if(adapter.rvPropertise.hasRefresh) {
                    swl.isRefreshing = false
                }
            }
        }

        recyclerAdapter.registerAdapterDataObserver(emptyObserver)

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
                    listener.onLoadItems(adapter.rvPropertise.limit, adapter.rvPropertise.offset)
                }
            }
        })



    }

    fun getAdapter(): BaseRVAdapter {
       return recyclerAdapter
    }

    override fun onRefresh() {
        Log.d("onRefresh","false")
        getAdapter().getItems().clear()
        getAdapter().notifyDataSetChanged()
        getAdapter().rvPropertise.offset = 0
        listener.onLoadItems(getAdapter().rvPropertise.limit, getAdapter().rvPropertise.offset)
    }

    override fun onClick(p0: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    interface RVListener {
        fun initAdapter(): BaseRVAdapter
        fun onLoadItems(limit: Int, offset: Int)
        fun initRV() : CustomeRV
    }
}