package kodigo.rzgonz.id.rzkotlin.apps

import rzgonz.core.kotlin.apps.RzApps
import rzgonz.core.kotlin.helper.APIHelper

/**
 * Created by rzgonz on 7/12/17.
 */
class APKModel : RzApps {

    constructor() : super()

    init {
       // APIHelper.BASE_URL = "http://sayaindonesia.setneg.go.id/api/"
        APIHelper.BASE_URL = "https://bkdroid.bknime.com/"
        APIHelper.Authorization ="Basic dXNlcm5hbWU6aW5kb25lc2lhZ28="
        APIHelper.HOST_NAME = "bkdroid.bknime.com"
        APIHelper.PUBLIC_KEY_HASH = "sha256/ZtTK4ku9tn5Sq7YqN6piQIbnJvkYoLuTi1/ujEVRkzI="
    }


}
