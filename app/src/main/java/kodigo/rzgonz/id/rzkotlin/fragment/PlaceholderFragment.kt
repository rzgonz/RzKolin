package kodigo.rzgonz.id.rzkotlin.fragment

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import kodigo.rzgonz.id.rzkotlin.R
import kodigo.rzgonz.id.rzkotlin.interfaces.FragmentView
import kodigo.rzgonz.id.rzkotlin.presenter.FragmentPresenter
import kotlinx.android.synthetic.main.activity_actpager.*
import rzgonz.core.kotlin.fragment.BaseFragment
import rzgonz.core.kotlin.view.CustomeViewPager

/**
 * Created by rzgonz on 9/20/17.
 */
/**
 * A placeholder fragment containing a simple view.
 */
class PlaceholderFragment : BaseFragment<FragmentView.View, FragmentView.Presenter>(), FragmentView.View,CustomeViewPager.PagerListener{
    override fun onSetData(status: Boolean, message: String, items: ArrayList<Any>) {

    }

    override var mPresenter: FragmentView.Presenter = FragmentPresenter()
    override fun initLayout(): Int {
        return R.layout.activity_actpager
    }

    override fun initUI() {
        cvpOne.listener = this
        cvpOne.setAdapter(activity)
        cvpOne.setBackgroundResource(android.R.color.holo_red_dark)
    }

    override fun initViewPager(): Int {
        return R.id.cvpOne
    }

    override fun initViewTabLayout() {
        tabs.setupWithViewPager(cvpOne)
        tabs.getTabAt(1)?.setIcon(R.mipmap.ic_launcher)?.setText("polo")
        tabs.getTabAt(0)?.setText("HAHA")
        tabs.getTabAt(2)?.setText("HAHA")
    }

    override fun addFragment(): ArrayList<Fragment> {
        var items: ArrayList<Fragment> = ArrayList()
        items.add(Frag_One.newInstance(4))
        items.add(Frag_One.newInstance(5))
        items.add(Frag_One.newInstance(6))
        return items
    }

    companion object {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private val ARG_SECTION_NUMBER = "section_number"

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        fun newInstance(sectionNumber: Int): PlaceholderFragment {
            val fragment = PlaceholderFragment()
            val args = Bundle()
            args.putInt(ARG_SECTION_NUMBER, sectionNumber)
            fragment.arguments = args
            return fragment
        }
    }
}