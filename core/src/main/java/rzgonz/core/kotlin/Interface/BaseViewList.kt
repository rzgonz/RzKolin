package rzgonz.core.kotlin.Interface

import rzgonz.core.kotlin.contract.BaseContract
import java.util.*


/**
 * Created by rzgonz on 7/10/17.
 */
interface BaseViewList:BaseContract.View {
    fun onSetData(status:Boolean, message:String, items: ArrayList<*> = java.util.ArrayList<Any>())
}