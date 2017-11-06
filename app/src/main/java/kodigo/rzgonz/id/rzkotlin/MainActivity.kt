package kodigo.rzgonz.id.rzkotlin

import android.util.Log
import kodigo.rzgonz.id.rzkotlin.adapter.AdapterHome
import kodigo.rzgonz.id.rzkotlin.interfaces.HomeView
import kodigo.rzgonz.id.rzkotlin.presenter.HomePresenter
import kotlinx.android.synthetic.main.activity_main.*
import rzgonz.core.kotlin.activity.BaseActivity
import rzgonz.core.kotlin.adapter.BaseRVAdapter
import rzgonz.core.kotlin.view.CustomeRV

class MainActivity : BaseActivity<HomeView.View, HomeView.Presenter>(),HomeView.View,CustomeRV.RVListener{

    override fun initRV(): CustomeRV {
        return rvSample
    }

    override fun initLayout(): Int {
       return R.layout.activity_main
    }

    override fun initUI(){
        tvSample.text = "HELLO SAMPKE"
        btnSample.text = ""
        btnSample.setOnClickListener {
            tvSample.text = "ON CLick Man"
            mPresenter.loadRepository("ONcrete")
            initAdapter().rvPropertise.colomCount = 1
        }

        imgSample.loadImageWeb("http://animeindo.net/wp-content/themes/animeindo/img/logo.png")

        mPresenter.loadHttps()
        rvSample.listener(this)


    }


    override fun initAdapter(): BaseRVAdapter {
        Log.d("initAdapter","BaseRVAdapter")
        return AdapterHome(this,ArrayList<Any>())
    }

    override var mPresenter: HomeView.Presenter = HomePresenter()

    override fun showRepository(repositoryDetail: String) {
        Log.d("MainActivity","showRepository")
    }

    override fun showReloadButton() {
        Log.d("MainActivity","showReloadButton")
    }

    override fun onLoadItems(limit: Int, offset: Int) {
        Log.d("onLoadData", "-->" + limit +" --> "+ offset)
        mPresenter.loadData(limit,offset)
    }

    override fun onSetData(status: Boolean, message: String, items: ArrayList<*>) {
        if(status){
            if(rvSample.getAdapter().getItemsCount()>100)
                items.clear()

            rvSample.getAdapter().setItems(items)
        }
    }
}
