package kodigo.rzgonz.id.rzkotlin.contract

import rzgonz.core.kotlin.Interface.BaseViewList
import rzgonz.core.kotlin.contract.BaseContract


/**
 * Created by rzgonz on 7/10/17.
 */

object HomeContract  {

    interface View : BaseViewList {
        fun showRepository(repositoryDetail: String)
        fun showReloadButton()
    }


    interface Presenter : BaseContract.Presenter<View> {

        fun loadRepository(name: String)
        fun loadData(limit:Int,offset:Int)
        fun loadHttps()
    }
}