package rzgonz.core.kotlin.contract

import android.app.Activity
import android.app.Application
import android.content.Context
import android.os.Bundle
import androidx.annotation.StringRes
import android.widget.ImageView


/**
 * Created by rzgonz on 7/10/17.
 */
 object BaseContract{

    interface  View {
        fun getContext():Context

        abstract fun initLayout(): Int

        abstract fun initUI(savedInstanceState: Bundle?)

        fun showError(error: String?)

        fun showError(@StringRes stringResId: Int)

        fun showMessage(@StringRes srtResId: Int)

        fun showMessage(message: String)

        fun ImageView.loadImageWeb(url:String)
    }

   interface Presenter<in V: View> {
        fun attachView(view: V)
        fun detachView()
    }
}