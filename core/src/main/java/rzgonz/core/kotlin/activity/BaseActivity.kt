package rzgonz.core.kotlin.activity

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import rzgonz.core.kotlin.Interface.BaseView
import rzgonz.core.kotlin.presenter.BasePresenter

/**
 * Created by rzgonz on 7/10/17.
 */
abstract class BaseActivity<in V: BaseView, P: BasePresenter<V>> : AppCompatActivity(), BaseView{
    protected abstract var mPresenter: P

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(initLayout())
        //initLayout()
        mPresenter.attachView(this as V)
        initUI()

    }

    override fun getContext(): Context = this


    override fun showError(error: String?) {
        Toast.makeText(this, error, Toast.LENGTH_LONG).show()
    }

    override fun showError(stringResId: Int) {
        Toast.makeText(this, stringResId, Toast.LENGTH_LONG).show()
    }

    override fun showMessage(srtResId: Int) {
        Toast.makeText(this, srtResId, Toast.LENGTH_LONG).show()
    }

    override fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter.detachView()
    }


    override fun ImageView.loadImageWeb(url: String) {
        Glide.with(context).load(url).into(this)
    }

    fun getStatusBarHeight(): Int {
        var result = 0
        val resourceId = resources.getIdentifier("status_bar_height", "dimen", "android")
        if (resourceId > 0) {
            result = resources.getDimensionPixelSize(resourceId)
        }
        return result
    }



}