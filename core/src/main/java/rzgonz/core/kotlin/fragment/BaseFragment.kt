package rzgonz.core.kotlin.fragment


import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.ContextThemeWrapper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import rzgonz.core.kotlin.contract.BaseContract

/**
 * Created by rzgonz on 9/19/17.
 */
abstract class BaseFragment<in V: BaseContract.View, P: BaseContract.Presenter<V>>: Fragment(), BaseContract.View {

   protected abstract var mPresenter: P

    private var title = javaClass.simpleName

    override fun getContext(): Context {
        return activity!!.baseContext
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView =  inflater.inflate(initLayout(), container, false)
        mPresenter.attachView(this as V)
        val resourceStyle = attachStyle()
        if (resourceStyle != null) {
            val contextThemeWrapper = ContextThemeWrapper(activity, resourceStyle)
            inflater.cloneInContext(contextThemeWrapper)
        }
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initUI(savedInstanceState)
        super.onViewCreated(view, savedInstanceState)
    }

    override fun showError(error: String?) {
        Toast.makeText(activity, error, Toast.LENGTH_LONG).show()
    }

    override fun showError(stringResId: Int) {
        Toast.makeText(activity, stringResId, Toast.LENGTH_LONG).show()
    }

    override fun showMessage(srtResId: Int) {
        Toast.makeText(activity, srtResId, Toast.LENGTH_LONG).show()
    }

    override fun showMessage(message: String) {
        Toast.makeText(activity, message, Toast.LENGTH_LONG).show()
    }
    override fun ImageView.loadImageWeb(url: String) {
        Glide.with(context).load(url).into(this)
    }

    override fun onDestroy() {
        super.onDestroy()

    }

    fun getTitle(): String {
        return title
    }

    fun setTitle(title: String) {
        this.title = title
    }



    fun attachStyle(): Int? {
        return null
    }
    fun getStatusBarHeight(): Int {
        var result = 0
        val resourceId = resources.getIdentifier("status_bar_height", "dimen", "android")
        if (resourceId > 0) {
            result = resources.getDimensionPixelSize(resourceId)
        }
        return result
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("onDetach","")
    }



}