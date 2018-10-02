package kodigo.rzgonz.id.rzkotlin.contract

import rzgonz.core.kotlin.contract.BaseContract

/**
 * Created by rzgonz on 7/10/17.
 */

object ActivityContract {

    interface View : BaseContract.View{

    }


    interface Presenter : BaseContract.Presenter<View> {

    }
}