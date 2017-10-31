package rzgonz.core.kotlin.presenter

import rzgonz.core.kotlin.Interface.BaseView


/**
 * Created by rzgonz on 7/10/17.
 */
open class BasePresenterImpl<V : BaseView> : BasePresenter<V> {

    protected lateinit var mView: V

    override fun attachView(view: V) {
        mView = view
    }

    override fun detachView() {
        //mView = null!!
    }


}