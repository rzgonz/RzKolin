package rzgonz.core.kotlin.Interface

import android.content.Context
import androidx.annotation.StringRes
import android.widget.ImageView

/**
 * Created by rzgonz on 7/10/17.
 */
interface BaseView {
    fun getContext(): Context

    abstract fun initLayout(): Int

    abstract fun initUI()

    fun showError(error: String?)

    fun showError(@StringRes stringResId: Int)

    fun showMessage(@StringRes srtResId: Int)

    fun showMessage(message: String)

    fun ImageView.loadImageWeb(url:String)
}