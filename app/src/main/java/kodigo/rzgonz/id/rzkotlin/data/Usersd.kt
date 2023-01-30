@file:JvmName("Person")

package kodigo.rzgonz.id.rzkotlin.data

import android.os.Parcel
import android.os.Parcelable



/**
 * Created by rzgonz on 9/24/17.
 */
 class Usersd(var params : String ) : Parcelable {

    private var coba : String = ""

    constructor(parcel: Parcel) : this(parcel.readString() ?: "") {
    }

    @JvmOverloads
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(params)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Usersd> {
        override fun createFromParcel(parcel: Parcel): Usersd {
            return Usersd(parcel)
        }

        override fun newArray(size: Int): Array<Usersd?> {
            return arrayOfNulls(size)
        }
    }




}