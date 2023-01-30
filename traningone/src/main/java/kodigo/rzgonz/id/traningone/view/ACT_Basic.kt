package kodigo.rzgonz.id.traningone.view

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import kodigo.rzgonz.id.traningone.R

class ACT_Basic : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener(View.OnClickListener { view ->
            intent.getStringExtra("hasil")?.let {
                Snackbar.make(view, it, Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
            }
        })
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)


        println("data")

    }

}
