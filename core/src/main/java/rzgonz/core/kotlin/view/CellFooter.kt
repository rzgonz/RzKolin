package rzgonz.core.kotlin.view

import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.cell_footer.view.*
import rzgonz.core.kotlin.R
import rzgonz.core.kotlin.holder.BaseItemHolder

/**
 * Created by rzgonz on 06/12/17.
 */
class CellFooter(itemView: View) : BaseItemHolder(itemView) {
//        fun bind(item: Item, listener: (Item) -> Unit) = with(itemView) {
//            itemTitle.text = item.title
//            itemImage.loadUrl(item.url)
//            setOnClickListener { listener(item) }
//        }

    lateinit var  callBack : cellFooterCallback

    fun loadMore(loadMore : Boolean){
        Log.d("CellLoading","loadMore $loadMore")
        if(!loadMore){
            itemView.visibility = View.GONE
        }

    }

    fun setListener(listener : cellFooterCallback){
        callBack = listener
    }

    fun errorLoading(){
        Log.d("CellLoading","erroLoading")
        itemView.pbLoading.visibility = View.GONE
        itemView.imgStatus.setImageResource(R.drawable.ic_error_outline)
        itemView.tvStatus.visibility = View.GONE
        itemView.btnTryAgain.visibility = View.VISIBLE
        itemView.btnTryAgain.setOnClickListener({
            Log.d("CellLoading","erroLoading $adapterPosition")
            itemView.pbLoading.visibility = View.VISIBLE
            callBack.onReaload(adapterPosition)
            itemView.btnTryAgain.visibility = View.GONE
        })
    }

    interface cellFooterCallback{
        fun onReaload(position: Int)
    }

}

