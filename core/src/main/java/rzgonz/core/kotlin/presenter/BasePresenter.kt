package rzgonz.core.kotlin.presenter

import rzgonz.core.kotlin.Interface.BaseView


/**
 * Created by rzgonz on 7/10/17.
 */
 interface BasePresenter<in V: BaseView> {
 fun attachView(view: V)
 fun detachView()
}