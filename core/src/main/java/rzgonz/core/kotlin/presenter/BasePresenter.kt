package rzgonz.core.kotlin.presenter

import io.reactivex.disposables.CompositeDisposable
import rzgonz.core.kotlin.contract.BaseContract


/**
 * Created by rzgonz on 7/10/17.
 */
open class BasePresenter<V : BaseContract.View> : BaseContract.Presenter<V>{

    lateinit var mView: V
    var mDisposable : CompositeDisposable = CompositeDisposable()

    override fun attachView(view: V) {
        mView = view
    }

    override fun detachView() {
       // mView = null
        mDisposable.dispose()
    }


}