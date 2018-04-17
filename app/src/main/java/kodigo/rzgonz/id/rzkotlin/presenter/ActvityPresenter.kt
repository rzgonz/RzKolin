package kodigo.rzgonz.id.rzkotlin.presenter

import kodigo.rzgonz.id.rzkotlin.API.APIService
import kodigo.rzgonz.id.rzkotlin.contract.ActivityContract
import rzgonz.core.kotlin.helper.APIHelper
import rzgonz.core.kotlin.presenter.BasePresenter

/**
 * Created by rzgonz on 7/10/17.
 */
class ActvityPresenter : BasePresenter<ActivityContract.View>(), ActivityContract.Presenter {

    val apiService = APIHelper.getClient().create(APIService::class.java)

}