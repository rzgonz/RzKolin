package rzgonz.core.kotlin.view

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import rzgonz.core.kotlin.R

/**
 * Created by rzgonz on 9/20/17.
 */

class CustomeViewPager(context: Context, attrs: AttributeSet?) : androidx.viewpager.widget.ViewPager(context, attrs) {
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


    fun setAdapter(activity: androidx.fragment.app.FragmentActivity?) {
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
        fun addFragment():ArrayList<androidx.fragment.app.Fragment>
    }

    inner class SectionsPagerAdapter(fm: androidx.fragment.app.FragmentManager) : androidx.fragment.app.FragmentStatePagerAdapter(fm) {

        override fun getItem(position: Int): androidx.fragment.app.Fragment {
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
