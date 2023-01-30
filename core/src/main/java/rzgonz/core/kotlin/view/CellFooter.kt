package rzgonz.core.kotlin.view

import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
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

    lateinit var callBack: cellFooterCallback

    fun loadMore(loadMore: Boolean) {
        Log.d("CellLoading", "loadMore $loadMore")
        if (!loadMore) {
            itemView.visibility = View.GONE
        }

    }

    fun setListener(listener: cellFooterCallback) {
        callBack = listener
    }

    fun errorLoading() {
        Log.d("CellLoading", "erroLoading")
        itemView.findViewById<ProgressBar>(R.id.pbLoading).visibility = View.GONE
        itemView.findViewById<ImageView>(R.id.imgStatus)
            .setImageResource(R.drawable.ic_error_outline)
        itemView.findViewById<TextView>(R.id.tvStatus).visibility = View.GONE
        itemView.findViewById<Button>(R.id.btnTryAgain).visibility = View.VISIBLE
        itemView.findViewById<Button>(R.id.btnTryAgain).setOnClickListener {
            Log.d("CellLoading", "erroLoading $adapterPosition")
            itemView.findViewById<ProgressBar>(R.id.pbLoading).visibility = View.VISIBLE
            callBack.onReaload(adapterPosition)
            itemView.findViewById<Button>(R.id.btnTryAgain).visibility = View.GONE
        }
    }

    interface cellFooterCallback {
        fun onReaload(position: Int)
    }

}

