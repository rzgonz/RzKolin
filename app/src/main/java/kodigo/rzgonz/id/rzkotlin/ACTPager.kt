package kodigo.rzgonz.id.rzkotlin

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout
import kodigo.rzgonz.id.rzkotlin.contract.ActivityContract
import kodigo.rzgonz.id.rzkotlin.fragment.Frag_One
import kodigo.rzgonz.id.rzkotlin.fragment.PlaceholderFragment
import kodigo.rzgonz.id.rzkotlin.presenter.ActvityPresenter
import kotlinx.android.synthetic.main.activity_actpager.*
import rzgonz.core.kotlin.activity.BaseActivity
import rzgonz.core.kotlin.view.CustomeViewPager


class ACTPager :BaseActivity<ActivityContract.View, ActivityContract.Presenter>(),ActivityContract.View,CustomeViewPager.PagerListener {

    override fun initLayout(): Int {
        return R.layout.activity_actpager
    }

    override fun initUI(savedInstanceState: Bundle?) {
        cvpOne.listener = this
        cvpOne.setAdapter(this)
        cvpOne.setBackgroundResource(android.R.color.holo_red_dark)
    }


    override fun initViewTabLayout() {
        val tabLayout = findViewById<TabLayout>(R.id.tabs)
        tabLayout.setupWithViewPager(cvpOne)
        tabLayout.getTabAt(1)?.setIcon(R.mipmap.ic_launcher)?.setText("polo")
        tabLayout.getTabAt(0)?.setText("HAHA")
        tabLayout.getTabAt(2)?.setText("HAHA")
    }
    override fun initViewPager(): Int {
        return R.id.cvpOne
    }

    override var mPresenter: ActivityContract.Presenter = ActvityPresenter()

    override fun addFragment(): ArrayList<Fragment> {
        var items: ArrayList<Fragment> = ArrayList()
        items.add(Frag_One.newInstance(4))
        items.add(PlaceholderFragment.newInstance(5))
        items.add(PlaceholderFragment.newInstance(6))
        return items
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_actpager, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId

        return if (id == R.id.action_settings) {
            true
        } else super.onOptionsItemSelected(item)

    }

}
