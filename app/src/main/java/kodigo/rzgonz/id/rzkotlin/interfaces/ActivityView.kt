package kodigo.rzgonz.id.rzkotlin.interfaces

import rzgonz.core.kotlin.Interface.BaseView
import rzgonz.core.kotlin.Interface.BaseViewList
import rzgonz.core.kotlin.presenter.BasePresenter

/**
 * Created by rzgonz on 7/10/17.
 */

object ActivityView {

    interface View : BaseView{

    }


    interface Presenter : BasePresenter<View>{

    }
}