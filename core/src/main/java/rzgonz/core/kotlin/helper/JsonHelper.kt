package rzgonz.core.kotlin.helper

import android.content.Context
import java.io.IOException
import java.nio.charset.Charset

/**
 * Created by rzgonz on 27/11/17.
 */

object JsonHelper{


    fun loadJSONFromAsset(context : Context,path :String): String {
        var json: String? = null
        try {

            val data = context.assets.open(path)

            val size = data.available()

            val buffer = ByteArray(size)

            data.read(buffer)

            data.close()

            json = String(buffer, Charset.defaultCharset())

        } catch (ex: IOException) {
            ex.printStackTrace()
            return "false"
        }

        return json

    }

}

