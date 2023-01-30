package rzgonz.core.kotlin.activity

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import rzgonz.core.kotlin.contract.BaseContract

/**
 * Created by rzgonz on 7/10/17.
 */
abstract class BaseActivity<in V: BaseContract.View, P: BaseContract.Presenter<V>> : AppCompatActivity(), BaseContract.View{
    protected abstract var mPresenter: P

    @Suppress("UNCHECKED_CAST")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(initLayout())
        mPresenter.attachView(view = this as V)
        initUI(savedInstanceState)
    }

    override fun getContext(): Context = baseContext


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

    override fun ImageView.loadImageWeb(url: String) {
        Glide.with(context).load(url).into(this)
    }
    override fun onDestroy() {
        super.onDestroy()
        mPresenter.detachView()
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