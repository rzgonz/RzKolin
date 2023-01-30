package rzgonz.core.kotlin.adapter

import android.content.Context
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import rzgonz.core.kotlin.R
import rzgonz.core.kotlin.holder.BaseItemHolder
import rzgonz.core.kotlin.model.RvPropertise
import rzgonz.core.kotlin.view.CellFooter
import rzgonz.core.kotlin.view.CellLoading
import kotlin.properties.Delegates

/**
 * Created by rzgonz on 7/11/17.
 */

abstract class BaseRVAdapter(c:Context, items: ArrayList<Any>)  : RecyclerView.Adapter<BaseItemHolder>() {

    val VIEW_TYPE_HEADER = 0
    val VIEW_TYPE_FOOTER= 1
    val VIEW_TYPE_ITEM = 2


    var c : Context by Delegates.notNull()

    private var items = ArrayList<Any>()

    var headerView: CellLoading? = null
    var footerView: CellFooter? = null

    var hasHeader : Boolean = false
    var hasFooter : Boolean = false
    var hasLoadMore : Boolean = false
    var hasRefresh  : Boolean = false
    var orientation:Int = GridLayoutManager.HORIZONTAL
    var colomCount : Int = 1

    var rvPropertise : RvPropertise = RvPropertise()

    lateinit var  footerCallBack : CellFooter.cellFooterCallback

    var countExtra = 0;

    init {
        this.c = c
        this.items = items
        rvPropertise = setRv()

        hasHeader = rvPropertise.hasHeadear
        hasFooter = rvPropertise.hasFooter
        hasLoadMore = rvPropertise.hasLoadmore
        colomCount = rvPropertise.colomCount
        hasRefresh = rvPropertise.hasRefresh
        orientation = rvPropertise.orientation


        if(rvPropertise.hasHeadear)
            countExtra++

        if(rvPropertise.hasFooter)
            countExtra++

    }

    override fun onBindViewHolder(holder: BaseItemHolder, position: Int) {
        if (getItemViewType(position) != VIEW_TYPE_HEADER && getItemViewType(position) != VIEW_TYPE_FOOTER) {
            if(hasHeader){
                onBindViewHolderItem(holder, position, position -1 )
            }else{
                onBindViewHolderItem(holder, position, position )
            }
        } else {
            onBindViewHolderOther(holder, position)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseItemHolder {
        if (viewType != VIEW_TYPE_HEADER && viewType != VIEW_TYPE_FOOTER) {
            Log.d("onCreateViewHolder","VIEW_TYPE_ITEM")
            return onCreateViewHolderItem(parent, viewType)
        } else if (viewType == VIEW_TYPE_HEADER) {
            Log.d("onCreateViewHolder","VIEW_TYPE_HEADER"+hasHeader)
            if(hasHeader){
            val v = LayoutInflater.from(c).inflate(R.layout.cell_loading, parent, false)
                return CellLoading(v)
            }
            else
                return onCreateViewHolderItem(parent, viewType)

        } else if (viewType == VIEW_TYPE_FOOTER) {
            //footerView.setBackgroundColor(android.R.color.holo_blue_bright)
            if(hasFooter) {
                val v = LayoutInflater.from(c).inflate(R.layout.cell_footer, parent, false)
             //   headerView.setBackgroundColor(android.R.color.black)
                footerView  = CellFooter(v)
                footerView?.setListener(footerCallBack)
                footerView!!.loadMore(hasLoadMore)
                return footerView as CellFooter
            }
            else
                return onCreateViewHolderItem(parent, viewType)

        } else {
            return onCreateViewHolderOther(parent, viewType)
        }
    }

    override fun getItemCount(): Int {
        if(items.size==0){
            return 0
        }
        return items.size+countExtra
    }

    override fun getItemViewType(position: Int): Int {
//        return if (!hasHeader && position >= 0 && position < getItemsCount()) VIEW_TYPE_ITEM
//        else if (position == 0) VIEW_TYPE_HEADER
//        else if(!hasFooter && position == getItemsCount()) VIEW_TYPE_ITEM
//        else if(hasFooter && position < getItemsCount()) VIEW_TYPE_ITEM
//        else VIEW_TYPE_FOOTER

        return if(hasHeader && position==0) VIEW_TYPE_HEADER
        else if(hasFooter && position > getItemsCount()) VIEW_TYPE_FOOTER
        else if(hasHeader && position <= getItemsCount()) VIEW_TYPE_ITEM+position
        else if(position < getItemsCount()) VIEW_TYPE_ITEM+position
        else VIEW_TYPE_FOOTER
    }


    /**
    *fun for generete items view
    **/
    protected abstract fun onCreateViewHolderItem(viewGroup: ViewGroup, viewType: Int): BaseItemHolder
    protected abstract fun onBindViewHolderItem(holder: BaseItemHolder?, position: Int, positionData : Int)

    /**
     * fun for genetre items custome view header
    * */
    protected fun onBindViewHolderOther(holder: BaseItemHolder, positionItem: Int) {}

    protected fun onCreateViewHolderOther(viewGroup: ViewGroup, viewType: Int): BaseItemHolder {
        return BaseItemHolder(View(c))
    }


    fun getItemsCount():Int{
        return items.size
    }

    fun getItems():ArrayList<Any>{
        return items
    }

    fun getItem(position: Int):Any{
        return items.get(position)
    }

    fun setItem(item : Any){
        items.add(item)
        notifyItemInserted(items.size)
    }

    private fun showFooter(){
        //  footerView.visibility = View.GONE
        if(footerView!=null) {
            footerView!!.itemView.visibility = View.VISIBLE
        }
        notifyItemChanged(getItemsCount())
    }

    private fun hidenFooter(){
      //  footerView.visibility = View.GONE
        if(footerView!=null) {
            footerView!!.itemView.visibility = View.GONE
        }
        notifyItemChanged(getItemsCount())
    }


    fun setItems(items: ArrayList<*>){
       // hidenFooter()
        showFooter()
        val before =this.items.size
        if(items.size==0){
            Log.e("BaseRVAdapter","STOP")
            hidenFooter()
            hasLoadMore = false
            return
        }
        this.items.addAll(items)
        notifyItemRangeInserted(before,this.items.size)
    }
    fun setItems(items: List<*>){
        // hidenFooter()
        val before =this.items.size
        showFooter()
        if(items.size==0){
            Log.e("BaseRVAdapter","STOP")
            hidenFooter()
            hasLoadMore = false
            return
        }
        for (data in items){
            this.items.add(data!!)
        }

        notifyItemRangeInserted(before,this.items.size)
    }

    /**
     * custom Recycle view
     */
    protected abstract fun setRv(): RvPropertise

    fun setListener(listener:CellFooter.cellFooterCallback) {
        footerCallBack = listener
    }


}



