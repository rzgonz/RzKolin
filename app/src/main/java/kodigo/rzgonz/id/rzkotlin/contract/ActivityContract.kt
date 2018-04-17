package kodigo.rzgonz.id.rzkotlin.contract

import rzgonz.core.kotlin.Interface.BaseView
import rzgonz.core.kotlin.contract.BaseContract

/**
 * Created by rzgonz on 7/10/17.
 */

object ActivityContract {

    interface View : BaseView{

    }


    interface Presenter : BaseContract<View> {

    }
}