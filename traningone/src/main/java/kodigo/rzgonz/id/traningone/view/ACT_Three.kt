package kodigo.rzgonz.id.traningone.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import kodigo.rzgonz.id.traningone.R

class ACT_Three : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener { view ->
            intent.getStringExtra("hasil")?.let {
                Snackbar.make(view, it, Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
            }
        }

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

}
