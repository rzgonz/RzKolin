package kodigo.rzgonz.id.rzkotlin.module

import dagger.Module
import dagger.Provides
import kodigo.rzgonz.id.rzkotlin.data.Usersd
import javax.inject.Singleton


@Module
class UserModule {

    @Provides
    @Singleton
    internal fun providesUser(): Usersd {
        return Usersd("Lars")
    }
}