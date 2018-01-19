package rzgonz.core.kotlin.view

import android.util.Log
import android.view.View
import rzgonz.core.kotlin.holder.BaseItemHolder

/**
 * Created by rzgonz on 06/12/17.
 */
class CellLoading(itemView: View) : BaseItemHolder(itemView) {
//        fun bind(item: Item, listener: (Item) -> Unit) = with(itemView) {
//            itemTitle.text = item.title
//            itemImage.loadUrl(item.url)
//            setOnClickListener { listener(item) }
//        }

    public fun loadMore(loadMore : Boolean){
        Log.d("CellLoading","loadMore $loadMore")
        if(!loadMore){
            itemView.visibility = View.GONE
        }

    }


    public fun errorLoading(){
        Log.d("CellLoading","erroLoading")
    }
}