package kodigo.rzgonz.id.rzkotlin.interfaces

import kodigo.rzgonz.id.rzkotlin.API.APIModel
import rzgonz.core.kotlin.Interface.BaseView
import rzgonz.core.kotlin.Interface.BaseViewList
import rzgonz.core.kotlin.presenter.BasePresenter


/**
 * Created by rzgonz on 7/10/17.
 */

object HomeView  {

    interface View : BaseViewList {
        fun showRepository(repositoryDetail: String)
        fun showReloadButton()
    }


    interface Presenter : BasePresenter<View> {

        fun loadRepository(name: String)
        fun loadData(limit:Int,offset:Int)
        fun loadHttps()
    }
}