package kodigo.rzgonz.id.traningone.presenter

import android.content.Context
import kodigo.rzgonz.id.traningone.model.CalculateModel

/**
 * Created by rzgonz on 9/18/17.
 */
class CalculatePresenter {

    var model : CalculateModel
    var context : Context

    constructor(model: CalculateModel, context: Context) {
        this.model = model
        this.context = context
    }

    fun hitung(x : String, y : String){
        var hasil = x.toInt() + y.toInt()
        model.Hasil(hasil.toDouble())

    }

}