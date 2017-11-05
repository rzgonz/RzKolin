package rzgonz.core.kotlin.helper

import android.util.Log
import okhttp3.*
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.IOException


/**
 * Created by rzgonz on 8/2/17.
 */
object APIHelper {

    var BASE_URL = ""
    var Authorization = ""
    var HOST_NAME = ""
    var PUBLIC_KEY_HASH= ""
    var ISHTTPS = false

    private var retrofit: Retrofit? = null

     fun  getClient(): Retrofit {
        if (retrofit == null) {
            var njing = ""

            var client = OkHttpClient().newBuilder().addInterceptor(Interceptor {
                chain: Interceptor.Chain? ->
                var original = chain?.request()
                var request = original?.newBuilder()
                        ?.header("Authorization", Authorization)
                        ?.method(original?.method(), original?.body())?.build()

                chain?.proceed(request)
            })


            if(ISHTTPS) {
                val certificatePinner = CertificatePinner.Builder()
                        .add(HOST_NAME, PUBLIC_KEY_HASH)
                        .build()
                client.certificatePinner(certificatePinner).build()

                val tlsSocketFactory: TLSSocketFactory


                tlsSocketFactory = TLSSocketFactory()
                client.sslSocketFactory(tlsSocketFactory, tlsSocketFactory.systemDefaultTrustManager())
            }

            Log.e("APIHelper", BASE_URL+"-->"+ Authorization)
            retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client.build())
                    .build()
        }



        return retrofit!!
    }
}