package kodigo.rzgonz.id.rzkotlin.ijection

import javax.inject.Inject


class Boltons @Inject
constructor(){

    fun prepareForWar() {
        //do something
        println(this.javaClass.simpleName + " prepared for war")
    }

    fun reportForWar() {
        //do something
        println(this.javaClass.simpleName + " reporting..")
    }
}