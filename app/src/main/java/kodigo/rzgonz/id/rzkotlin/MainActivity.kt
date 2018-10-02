package kodigo.rzgonz.id.rzkotlin

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import kodigo.rzgonz.id.rzkotlin.adapter.AdapterHome
import kodigo.rzgonz.id.rzkotlin.apps.APKModel
import kodigo.rzgonz.id.rzkotlin.contract.HomeContract
import kodigo.rzgonz.id.rzkotlin.presenter.HomePresenter
import kotlinx.android.synthetic.main.activity_main.*
import rzgonz.core.kotlin.activity.BaseActivity
import rzgonz.core.kotlin.adapter.BaseRVAdapter
import rzgonz.core.kotlin.view.CustomeRV
import java.util.concurrent.TimeUnit


class MainActivity : BaseActivity<HomeContract.View, HomeContract.Presenter>(),HomeContract.View,CustomeRV.RVListener{


    override fun initRV(): CustomeRV = rvSample

    override fun initLayout(): Int = R.layout.activity_main

    var com : CompositeDisposable = CompositeDisposable()

    override fun initUI(savedInstanceState: Bundle?) {
        tvSample.text = "HELLO SAMPKE"
        btnSample.setOnClickListener {
            tvSample.text = "ON CLick Man"
            mPresenter.loadRepository("ONcrete")
            initAdapter().rvPropertise.colomCount = 1

            for ( i in 1..1000){
             mPresenter.loadHttps()
             }


          //  Log.d("sa"," cabe ${SampleDI.dataSaya}")


            //DaggerBattleComponent.builder()

            //startActivity(Intent(baseContext,KotlinHome::class.java))
        }

        btnOld.setOnClickListener {
            for ( i in 1..1000){
                APKModel.getBusComponent().topSubject.onNext("data $i")
                mPresenter.loadData(0,100)
            }
        }

        imgSample.loadImageWeb("http://animeindo.net/wp-content/themes/animeindo/img/logo.png")

        tvSample.setOnClickListener {
            startActivity(Intent(baseContext,ACTPager::class.java))
        }


        mPresenter.loadHttps()
        rvSample.listener(this)

        val text = createTextChangeObservable().subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .map { Log.d("rxAndroid","map $it")
                    imgSample.visibility = View.GONE
                    mPresenter.loadData(0,100)
                }
                .doOnNext{
                    Log.d("rxAndroid","donext $it")
                    rvSample.getAdapter().getItems().clear()
                    rvSample.getAdapter().notifyDataSetChanged()
                }
                .subscribe {
                    Log.d("rxAndroid","done $it")
                    imgSample.visibility = View.VISIBLE
                    com.dispose()
                }

        com.add(text)
        //com.add(btn)
    }
    // 1
    private fun createTextChangeObservable(): Observable<String> {
        // 2
        val textChangeObservable = Observable.create<String> { emitter ->
            // 3
            val textWatcher = object : TextWatcher {

                override fun afterTextChanged(s: Editable?) = Unit

                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) = Unit

                // 4
                override fun onTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                    s?.toString()?.let { emitter.onNext(it) }
                }

            }

            // 5
            editText.addTextChangedListener(textWatcher)

            // 6
            emitter.setCancellable {
                editText.removeTextChangedListener(textWatcher)
            }
        }

        // 7
        return textChangeObservable.filter { it.length > 4 }.debounce(1,TimeUnit.SECONDS)
    }

    // 1
    private fun createButtonClickObservable(): Observable<String> {
        // 2
        return Observable.create { emitter ->
            // 3
            btnSample.setOnClickListener {
                // 4
                emitter.onNext(tvSample.text.toString())
            }

            // 5
            emitter.setCancellable {
                // 6
            }
        }
    }


    override fun initAdapter(): BaseRVAdapter {
        Log.d("initAdapter","BaseRVAdapter")
        return AdapterHome(this,ArrayList<Any>())
    }

    override var mPresenter: HomeContract.Presenter = HomePresenter()

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
