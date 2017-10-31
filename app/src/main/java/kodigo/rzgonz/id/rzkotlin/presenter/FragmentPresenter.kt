package kodigo.rzgonz.id.rzkotlin.presenter

import android.util.Log
import kodigo.rzgonz.id.rzkotlin.API.APIModelArray
import kodigo.rzgonz.id.rzkotlin.API.APIService
import kodigo.rzgonz.id.rzkotlin.interfaces.FragmentView
import kodigo.rzgonz.id.rzkotlin.interfaces.HomeView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import rzgonz.core.kotlin.helper.APIHelper
import rzgonz.core.kotlin.presenter.BasePresenterImpl

/**
 * Created by rzgonz on 7/10/17.
 */
class FragmentPresenter : BasePresenterImpl<FragmentView.View>(), FragmentView.Presenter {

    val apiService = APIHelper.getClient().create(APIService::class.java)
    override fun loadData(limit: Int, offset: Int) {

    }
}