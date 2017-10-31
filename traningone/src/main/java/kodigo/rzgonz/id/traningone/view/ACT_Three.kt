package kodigo.rzgonz.id.traningone.view

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import kodigo.rzgonz.id.traningone.R

class ACT_Three : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener { view ->
            Snackbar.make(view,intent.getStringExtra("hasil"), Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

}
