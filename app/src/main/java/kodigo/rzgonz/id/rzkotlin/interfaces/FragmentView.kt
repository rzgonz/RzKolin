package kodigo.rzgonz.id.rzkotlin.interfaces

import rzgonz.core.kotlin.Interface.BaseView
import rzgonz.core.kotlin.Interface.BaseViewList
import rzgonz.core.kotlin.presenter.BasePresenter

/**
 * Created by rzgonz on 9/20/17.
 */
object FragmentView  {

    interface View : BaseViewList{

    }


    interface Presenter : BasePresenter<View>{
        fun loadData(limit:Int,offset:Int)
    }
}