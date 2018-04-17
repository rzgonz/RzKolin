package kodigo.rzgonz.id.rzkotlin.presenter

import kodigo.rzgonz.id.rzkotlin.API.APIService
import kodigo.rzgonz.id.rzkotlin.contract.FragmentContract
import rzgonz.core.kotlin.helper.APIHelper
import rzgonz.core.kotlin.presenter.BasePresenter

/**
 * Created by rzgonz on 7/10/17.
 */
class FragmentPresenter : BasePresenter<FragmentContract.View>(),FragmentContract.Presenter {

    val apiService = APIHelper.getClient().create(APIService::class.java)
    override fun loadData(limit: Int, offset: Int) {

    }
}