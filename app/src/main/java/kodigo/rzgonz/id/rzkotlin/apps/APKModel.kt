package kodigo.rzgonz.id.rzkotlin.apps

import kodigo.rzgonz.id.rzkotlin.ijection.component.BusComponent
import kodigo.rzgonz.id.rzkotlin.ijection.component.DaggerBusComponent
import kodigo.rzgonz.id.rzkotlin.ijection.module.BusModule
import rzgonz.core.kotlin.apps.RzApps
import rzgonz.core.kotlin.helper.APIHelper

/**
 * Created by rzgonz on 7/12/17.
 */
class APKModel : RzApps() {

    init {
        APIHelper.BASE_URL = "http://sayaindonesia.setneg.go.id/api/"
       // APIHelper.BASE_URL = "https://bkdroid.bknime.com/"
       // APIHelper.Authorization ="Basic dXNlcm5hbWU6aW5kb25lc2lhZ28="
        val header = HashMap<String,String>();
        header["Authorization"] = "Basic dXNlcm5hbWU6aW5kb25lc2lhZ28="
        APIHelper.Headers  = header
        APIHelper.HOST_NAME = "bkdroid.bknime.com"
        APIHelper.PUBLIC_KEY_HASH = "sha256/ZtTK4ku9tn5Sq7YqN6piQIbnJvkYoLuTi1/ujEVRkzI="
        sBusComponent = DaggerBusComponent.builder().busModule(BusModule).build()
    }

    companion object {
        lateinit var sBusComponent: BusComponent
        fun  getBusComponent(): BusComponent = sBusComponent

    }

}
