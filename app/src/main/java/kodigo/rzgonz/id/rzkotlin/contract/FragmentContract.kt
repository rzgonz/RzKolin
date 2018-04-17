package kodigo.rzgonz.id.rzkotlin.contract

import rzgonz.core.kotlin.Interface.BaseViewList
import rzgonz.core.kotlin.contract.BaseContract

/**
 * Created by rzgonz on 9/20/17.
 */
object FragmentContract  {

    interface View : BaseViewList{

    }


    interface Presenter : BaseContract<View> {
        fun loadData(limit:Int,offset:Int)
    }
}