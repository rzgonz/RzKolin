package rzgonz.core.kotlin.injection.module

import dagger.Module
import dagger.Provides
import okhttp3.CertificatePinner
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import rzgonz.core.kotlin.helper.TLSSocketFactory
import javax.inject.Singleton

/**
 * Created by rzgonz on 8/2/17.
 */
@Module
class ApiModule {
    var BASE_URL = ""
    //var Authorization = ""
    var Headers:HashMap<String,String> = HashMap()
    var HOST_NAME = ""
    var PUBLIC_KEY_HASH= ""
    var ISHTTPS = false

    private var retrofit: Retrofit? = null

    @Provides
    @Singleton
    fun  getClient(headers: HashMap<String, String> = HashMap()): Retrofit {
        if (retrofit == null) {

            val client = OkHttpClient().newBuilder().addInterceptor(Interceptor {
                chain: Interceptor.Chain ->
                val original = chain.request()
                val request = original.newBuilder()
                        //?.header("Authorization", Authorization)
                        .method(original.method, original.body)

                for(data in headers){
                    Headers.set(data.key,data.value)
                }

                for (items in Headers){
                    request?.addHeader(items.key,items.value)
                }

                chain.proceed(request.build())
            })


            if(ISHTTPS) {
                val certificatePinner = CertificatePinner.Builder()
                        .add(HOST_NAME, PUBLIC_KEY_HASH)
                        .build()
                client.certificatePinner(certificatePinner).build()

                val tlsSocketFactory: TLSSocketFactory = TLSSocketFactory()
                client.sslSocketFactory(tlsSocketFactory, tlsSocketFactory.systemDefaultTrustManager())
            }

            retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .client(client.build())
                    .build()
        }

        return retrofit!!
    }
}