package rzgonz.core.kotlin.reciver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import rzgonz.core.kotlin.constat.ConstantNetwork

/**
 * Created by rzgonz on 11/13/17.
 */

open class NetworkReciver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val status = ConstantNetwork.getConnectivityStatus(context)
        Log.d("NetworkReciver","status $status")
        //Toast.makeText(context,"NETWORK",Toast.LENGTH_LONG).show()
        if (status == ConstantNetwork.TYPE_NOT_CONNECTED) {

        }

    }


}