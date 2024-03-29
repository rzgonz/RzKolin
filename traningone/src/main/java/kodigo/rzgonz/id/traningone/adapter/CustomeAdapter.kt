package kodigo.rzgonz.id.traningone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kodigo.rzgonz.id.traningone.R

/**
 * Created by rzgonz on 9/18/17.
 */
class CustomeAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder> {

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            holder.tvOne?.text = "--> " + items!!.get(position)
            holder.imgOne?.setImageResource(images!!.get(position))
        }
    }

    var images: ArrayList<Int>? = null
    var items: ArrayList<String>? = null
    var context: Context? = null


    override fun getItemCount(): Int {
        return items!!.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):MyViewHolder {

        var view = LayoutInflater.from(context).inflate(R.layout.cell_sample,parent,false)

        var holder = MyViewHolder(view)

        return holder

    }

    constructor(images: ArrayList<Int>?, items: ArrayList<String>?, context: Context?) : super() {
        this.images = images
        this.items = items
        this.context = context
    }


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvOne = itemView.findViewById<TextView>(R.id.tvOne)
        var imgOne = itemView.findViewById<ImageView>(R.id.imgOne)

    }

}