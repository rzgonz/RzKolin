package kodigo.rzgonz.id.rzkotlin.fragment

import android.os.Bundle
import kodigo.rzgonz.id.rzkotlin.R
import kodigo.rzgonz.id.rzkotlin.adapter.AdapterHome
import kodigo.rzgonz.id.rzkotlin.contract.FragmentContract
import kodigo.rzgonz.id.rzkotlin.presenter.FragmentPresenter
import kotlinx.android.synthetic.main.activity_main.*
import rzgonz.core.kotlin.adapter.BaseRVAdapter
import rzgonz.core.kotlin.config.Config
import rzgonz.core.kotlin.fragment.BaseFragment
import rzgonz.core.kotlin.view.CustomeRV

/**
 * A placeholder fragment containing a simple view.
 */
class Frag_One : BaseFragment<FragmentContract.View, FragmentContract.Presenter>(),FragmentContract.View,CustomeRV.RVListener {
    override fun initAdapter(): BaseRVAdapter {
        return AdapterHome(context,ArrayList<Any>())
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

    override fun initUI(savedInstanceState: Bundle?) {
       // tvSection.text = " kampret " +arguments.getInt(Config.PARAMS_FRG)
        rvSample.listener(this)
    }


    override var mPresenter: FragmentContract.Presenter = FragmentPresenter()

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