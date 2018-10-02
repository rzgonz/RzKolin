package rzgonz.core.kotlin.fragment

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import rzgonz.core.kotlin.contract.DIBaseContract


abstract class DIBaseFragment: Fragment(), DIBaseContract.View{

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater.inflate(initLayout(), container, false)

    override fun getContext(): Context {
        return activity!!.baseContext
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        inject()
        onAttachView()
        initUI(savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        onDetachView()
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
}