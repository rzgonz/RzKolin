package kodigo.rzgonz.id.rzkotlin.ijection.module

import dagger.Module
import dagger.Provides
import io.reactivex.subjects.PublishSubject
import javax.inject.Named
import javax.inject.Singleton


@Module
object BusModule {

    const val PROVIDER_TOP_SUBJECT = "PROVIDER_TOP_SUBJECT"
    const val PROVIDER_BOTTOM_SUBJECT = "PROVIDER_BOTTOM_SUBJECT"


    @Provides
    @Singleton
    @Named(PROVIDER_TOP_SUBJECT)
    fun provideTopSubject(): PublishSubject<String> {
        return PublishSubject.create()
    }

    @Provides
    @Singleton
    @Named(PROVIDER_BOTTOM_SUBJECT)
    fun provideBottomSubject(): PublishSubject<String> {
        return PublishSubject.create()
    }
}