package kodigo.rzgonz.id.traningtwo.service

import kodigo.rzgonz.id.traningtwo.service.rest.ApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by rzgonz on 9/19/17.
 */
class InitRetrofit{

    fun getClient () :Retrofit {
        var retrofit = Retrofit.Builder()
                .baseUrl("http://bkdroid.bknime.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        return retrofit
    }

    fun InstantRetrofit():ApiService{
        return getClient().create(ApiService::class.java)
    }
}