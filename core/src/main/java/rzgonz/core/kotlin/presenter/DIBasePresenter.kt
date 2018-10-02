package rzgonz.core.kotlin.presenter

import rzgonz.core.kotlin.contract.DIBaseContract

open class DIBasePresenter<V : DIBaseContract.View> : DIBaseContract.Presenter<V> {

    private var mView: V? = null
   // var mSubscription = CompositeSubscription()

    override fun attachView(view: V) {
        mView = view
    }

    override fun detachView() {
        mView = null
        //mSubscription.clear()
    }

    fun getView(): V? = mView
}