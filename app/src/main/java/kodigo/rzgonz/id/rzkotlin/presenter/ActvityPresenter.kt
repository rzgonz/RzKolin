package kodigo.rzgonz.id.rzkotlin.presenter

import android.util.Log
import kodigo.rzgonz.id.rzkotlin.API.APIModelArray
import kodigo.rzgonz.id.rzkotlin.API.APIService
import kodigo.rzgonz.id.rzkotlin.interfaces.ActivityView
import rzgonz.core.kotlin.helper.APIHelper
import rzgonz.core.kotlin.presenter.BasePresenterImpl

/**
 * Created by rzgonz on 7/10/17.
 */
class ActvityPresenter : BasePresenterImpl<ActivityView.View>(), ActivityView.Presenter {

    val apiService = APIHelper.getClient().create(APIService::class.java)


}