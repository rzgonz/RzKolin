package rzgonz.core.kotlin.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import rzgonz.core.kotlin.contract.BaseContract
import rzgonz.core.kotlin.fragment.BaseFragment

/**
 * Created by rzgonz on 9/19/17.
 */
class BasePagerAdapter : androidx.fragment.app.FragmentStatePagerAdapter {

    private val items: ArrayList<BaseFragment<BaseContract.View, BaseContract.Presenter<BaseContract.View>>> = ArrayList()

    constructor(fm: androidx.fragment.app.FragmentManager) : super(fm)

    override fun getItem(position: Int): androidx.fragment.app.Fragment {
       return items.get(position)
    }

    override fun getCount(): Int {
       return items.size
    }

    override fun getPageTitle(position: Int): String? {
        return items[position].tag
    }

}