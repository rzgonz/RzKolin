package rzgonz.core.kotlin.view

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import rzgonz.core.kotlin.R

/**
 * Created by rzgonz on 9/20/17.
 */

class CustomeViewPager(context: Context, attrs: AttributeSet?) : ViewPager(context, attrs) {
    lateinit var listener: PagerListener
    init {
        LayoutInflater.from(context).inflate(R.layout.custome_pager_view, this, true)
    }

    fun setAdapter(context:AppCompatActivity) {
        //mSectionsPagerAdapter = SectionsPagerAdapter(context.supportFragmentManager)
        // Set up the ViewPager with the sections adapter.
        this.adapter = SectionsPagerAdapter(context.supportFragmentManager)
        listener.initViewTabLayout()
       // val tabLayout = findViewById(R.id.tabs) as TabLayout
//        tabLayout.setupWithViewPager(vp)
//        vp.adapter.notifyDataSetChanged()
    }


    fun setAdapter(activity: FragmentActivity?) {
        //mSectionsPagerAdapter = SectionsPagerAdapter(context.supportFragmentManager)
        // Set up the ViewPager with the sections adapter.
        this.adapter = activity?.supportFragmentManager?.let { SectionsPagerAdapter(it) }
        listener.initViewTabLayout()
        // val tabLayout = findViewById(R.id.tabs) as TabLayout
//        tabLayout.setupWithViewPager(vp)
//        vp.adapter.notifyDataSetChanged()
    }


    interface PagerListener {
        fun initViewPager():Int
        fun initViewTabLayout()
        fun addFragment():ArrayList<Fragment>
    }

    inner class SectionsPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

        override fun getItem(position: Int): Fragment {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            Log.e("cvp","getItem --> "+listener.addFragment().size)
            return listener.addFragment().get(position)
        }

        override fun getCount(): Int {
            // Show 3 total pages.
            Log.e("cvp","getCount --> "+listener.addFragment().size)
            return listener.addFragment().size
        }

        override fun getPageTitle(position: Int): CharSequence? {

            return "NOT SET "+position
        }
    }

}
