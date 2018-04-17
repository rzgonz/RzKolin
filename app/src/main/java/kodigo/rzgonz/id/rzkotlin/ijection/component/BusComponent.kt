package kodigo.rzgonz.id.rzkotlin.ijection.component

import dagger.Component
import io.reactivex.subjects.PublishSubject
import kodigo.rzgonz.id.rzkotlin.ijection.module.BusModule
import javax.inject.Named
import javax.inject.Singleton


@Component(modules = [(BusModule::class)])
@Singleton
interface BusComponent {

    @get:Named(BusModule.PROVIDER_TOP_SUBJECT)
    val topSubject: PublishSubject<String>

    @get:Named(BusModule.PROVIDER_BOTTOM_SUBJECT)
    val bottomSubject: PublishSubject<String>
}