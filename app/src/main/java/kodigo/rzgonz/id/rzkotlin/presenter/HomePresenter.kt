package kodigo.rzgonz.id.rzkotlin.presenter

import android.util.Log
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kodigo.rzgonz.id.rzkotlin.API.APIModelArray
import kodigo.rzgonz.id.rzkotlin.API.APIService
import kodigo.rzgonz.id.rzkotlin.contract.HomeContract
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import rzgonz.core.kotlin.helper.APIHelper
import rzgonz.core.kotlin.presenter.BasePresenter


/**
 * Created by rzgonz on 7/10/17.
 */
class HomePresenter : BasePresenter<HomeContract.View>(),HomeContract.Presenter {

    val apiService = APIHelper.getClient().create(APIService::class.java)


    override fun loadRepository(name: String) {
        Log.d("HomePresenter","loadRepository")
        mView.showReloadButton()

    }


    override fun loadHttps() {
        Log.d("TAG", "Number of movies received: ")
        var rx = apiService.rxCOba().subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnNext {
                    for (i in 0..100){
                        Log.d("TAG", "next 1 $i ")
                    }
                }.doOnNext {
                    for (i in 0..100){
                        Log.d("TAG", "next 2 $i ")
                    }
                }.subscribe({
                        Log.d("TAG", "next $")
                    },{
                        Log.d("TAG", "error $")
                    })


//        val call = apiService.getHttps()
//
//        Log.d("TAG", "Number of movies received: ")
//
//        call.enqueue(object : Callback<Any> {
//            override fun onResponse(call: Call<Any>, response: Response<Any>) {
//                val movies = response.body()!!.toString()
//                Log.d("onResponse", "Number of movies received: " + movies)
//               // mView.onSetData(true, (response.body() as APIModelArray).message, (response.body() as APIModelArray).data)
//                //mView?.returnData(response.body() as APIModel)
//            }
//
//            override fun onFailure(call: Call<Any>, t: Throwable) {
//                // Log error here since request failed
//               // mView.onSetData(false,"GAGAL COY", null!!)
//                Log.e("onFailure", call.toString())
//            }
//        })

    }

    override fun loadData(limit: Int, offset: Int) {
        val call = apiService.getCategory()
        Log.d("TAG", "Number of movies received: ")
        call.enqueue(object : Callback<APIModelArray> {
            override fun onResponse(call: Call<APIModelArray>, response: Response<APIModelArray>) {
                val movies = response.body().toString()
                Log.d("onResponse", "Number of movies received: " + movies)
                mView.onSetData(true, (response.body() as APIModelArray).message, (response.body() as APIModelArray).data)
            }

            override fun onFailure(call: Call<APIModelArray>, t: Throwable) {
                // Log error here since request failed
                mView.onSetData(false,"GAGAL COY",ArrayList<Any>())
                Log.e("onFailure", t.toString())
            }
        })

    }
}