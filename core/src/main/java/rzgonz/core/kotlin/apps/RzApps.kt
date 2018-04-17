package rzgonz.core.kotlin.apps

import android.content.Context
import android.support.multidex.MultiDex
import android.support.multidex.MultiDexApplication

/**
 * Created by rzgonz on 7/12/17.
 */
open class RzApps : MultiDexApplication() {

    init {
        instance = this
    }


    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)

    }

    companion object {
        @get:Synchronized var instance: RzApps? = null
            private set
    }
}
