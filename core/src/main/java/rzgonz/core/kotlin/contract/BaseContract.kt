package rzgonz.core.kotlin.contract

import rzgonz.core.kotlin.Interface.BaseView


/**
 * Created by rzgonz on 7/10/17.
 */
 interface BaseContract<in V: BaseView> {
    fun attachView(view: V)
    fun detachView()
}