package kodigo.rzgonz.id.rzkotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kodigo.rzgonz.id.rzkotlin.R
import kodigo.rzgonz.id.rzkotlin.apps.APKModel
import rzgonz.core.kotlin.adapter.BaseRVAdapter
import rzgonz.core.kotlin.holder.BaseItemHolder
import rzgonz.core.kotlin.model.RvPropertise
import java.util.*

/**
 * Created by rzgonz on 7/11/17.
 */

class AdapterHome(c: Context, items: ArrayList<Any>) : BaseRVAdapter(c, items) {

    override fun setRv(): RvPropertise {
        rvPropertise.hasFooter = true
        rvPropertise.hasHeadear = false
        rvPropertise.colomCount = 2
        rvPropertise.reverseLayout = true
        rvPropertise.hasRefresh = true
        rvPropertise.hasLoadmore = true
        return rvPropertise
    }


    override fun onBindViewHolderItem(holder: BaseItemHolder?, position: Int, positionData: Int) {
//        (holder as Item)
    }

    override fun onCreateViewHolderItem(viewGroup: ViewGroup, viewType: Int): Item {
        var v = LayoutInflater.from(c).inflate(R.layout.item_list_sample, viewGroup, false)
        return Item(v)
    }



    class Item(itemView: View) : BaseItemHolder(itemView) {
        var tvJudul = itemView.findViewById<TextView>(R.id.textView)

        init {
            APKModel.getBusComponent().topSubject.subscribe({
                tvJudul.setText(it)
            })
        }

    }


}



