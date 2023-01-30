package rzgonz.core.kotlin.apps

import android.content.Context
import androidx.multidex.MultiDex
import androidx.multidex.MultiDexApplication

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
