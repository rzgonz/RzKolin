package rzgonz.core.kotlin.Interface

import rzgonz.core.kotlin.view.CustomeRV


/**
 * Created by rzgonz on 7/10/17.
 */
interface BaseViewList:BaseView {
    fun onSetData(status:Boolean, message:String, items: ArrayList<*>)
}