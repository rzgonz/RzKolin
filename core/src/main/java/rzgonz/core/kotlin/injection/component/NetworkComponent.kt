package rzgonz.core.kotlin.injection.component

import dagger.Component
import rzgonz.core.kotlin.injection.module.ApiModule
import rzgonz.core.kotlin.injection.module.ConnectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [(ApiModule::class),(ConnectionModule::class)])
interface NetworkComponent {

}