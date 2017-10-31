package kodigo.rzgonz.id.rzkotlin.fragment

import android.os.Bundle
import kodigo.rzgonz.id.rzkotlin.R
import kodigo.rzgonz.id.rzkotlin.adapter.AdapterHome
import kodigo.rzgonz.id.rzkotlin.interfaces.FragmentView
import kodigo.rzgonz.id.rzkotlin.presenter.FragmentPresenter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_act_tab.*
import rzgonz.core.kotlin.adapter.BaseRVAdapter
import rzgonz.core.kotlin.config.Config
import rzgonz.core.kotlin.fragment.BaseFragment
import rzgonz.core.kotlin.view.CustomeRV

/**
 * A placeholder fragment containing a simple view.
 */
class Frag_One : BaseFragment<FragmentView.View,FragmentView.Presenter>(),FragmentView.View,CustomeRV.RVListener {
    override fun onSetData(status: Boolean, message: String, items: ArrayList<Any>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initAdapter(): BaseRVAdapter {
        return AdapterHome(activity,ArrayList<Any>())
    }

    override fun onLoadItems(limit: Int, offset: Int) {
        mPresenter.loadData(limit,offset)
    }

    override fun initRV(): CustomeRV {
        return rvSample
    }

    override fun initLayout(): Int {
      return  R.layout.activity_main
    }

    override fun initUI() {
       // tvSection.text = " kampret " +arguments.getInt(Config.PARAMS_FRG)
        rvSample.listener(this)
    }


    override var mPresenter: FragmentView.Presenter = FragmentPresenter()

    companion object {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */


        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        fun newInstance(sectionNumber: Int): Frag_One {
            val fragment = Frag_One()
            val args = Bundle()
            args.putInt(Config.PARAMS_FRG, sectionNumber)
            fragment.arguments = args
            return fragment
        }
    }

}