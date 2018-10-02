package rzgonz.core.kotlin.activity

import android.app.ProgressDialog
import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import rzgonz.core.kotlin.contract.DIBaseContract

abstract class DIBaseActivity : AppCompatActivity(), DIBaseContract.View {

    protected var progressDialog: ProgressDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(initLayout())
        inject()
        onAttachView()
        initUI(savedInstanceState)
    }

    override fun onDestroy() {
        super.onDestroy()
        onDetachView()
        progressDialog = null
    }

    fun showProgressDialog(context: Context?, message: String?, isCancelable: Boolean) {
        if (context == null) return
        // TODO: Change Progress dialog color
        progressDialog = ProgressDialog(context)
        progressDialog?.run {
            if (message != null) {
                progressDialog!!.setMessage(message)
            }
            setIndeterminate(true)
            setCancelable(isCancelable)
            setCanceledOnTouchOutside(false)
            show()
        }
    }

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

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }

}