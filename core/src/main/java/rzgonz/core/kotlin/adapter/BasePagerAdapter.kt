package rzgonz.core.kotlin.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import rzgonz.core.kotlin.contract.BaseContract
import rzgonz.core.kotlin.fragment.BaseFragment

/**
 * Created by rzgonz on 9/19/17.
 */
class BasePagerAdapter : FragmentStatePagerAdapter{

    private val items: ArrayList<BaseFragment<BaseContract.View, BaseContract.Presenter<BaseContract.View>>> = ArrayList()

    constructor(fm: FragmentManager?) : super(fm)

    override fun getItem(position: Int): Fragment {
       return items.get(position)
    }

    override fun getCount(): Int {
       return items.size
    }

    override fun getPageTitle(position: Int): String? {
        return items[position].tag
    }

}