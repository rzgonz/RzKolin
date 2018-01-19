package rzgonz.core.kotlin.helper

import android.os.Environment
import android.util.Log
import java.io.File

/**
 * Created by rzgonz on 04/01/18.
 */

class FolderHelper{
    companion object {
        fun createDirIfNotExists(path: String): Boolean {
            var ret = true

            val file = File(Environment.getExternalStorageDirectory(), path)
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    Log.e("TravellerLog :: ", "Problem creating Image folder")
                    ret = false
                }
            }
            return ret
        }
        fun deleteDirectory(path: File): Boolean {
            if (path.exists()) {
                val files = path.listFiles() ?: return true
                for (i in files.indices) {
                    if (files[i].isDirectory) {
                        deleteDirectory(files[i])
                    } else {
                        files[i].delete()
                    }
                }
            }
            return path.delete()

        }
    }



}