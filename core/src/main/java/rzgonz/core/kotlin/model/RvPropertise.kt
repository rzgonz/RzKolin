package rzgonz.core.kotlin.model

import androidx.recyclerview.widget.GridLayoutManager

/**
 * Created by rzgonz on 7/13/17.
 */
 class RvPropertise {

    var hasHeadear : Boolean = false
    var hasFooter  : Boolean = false
    var hasLoadmore: Boolean = false
    var onRefresh  : Boolean = false
    var colomCount  : Int      = 1
    var limit      : Int     = 10
    var offset     : Int     = 0
    var reverseLayout : Boolean = false
    var hasRefresh: Boolean     = false
    var orientation:Int = GridLayoutManager.VERTICAL

}