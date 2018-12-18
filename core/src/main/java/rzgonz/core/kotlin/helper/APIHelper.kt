package rzgonz.core.kotlin.helper

import android.util.Log
import okhttp3.CertificatePinner
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


/**
 * Created by rzgonz on 8/2/17.
 */
object APIHelper {
    var BASE_URL = ""
    //var Authorization = ""
    var Headers:HashMap<String,String> = HashMap()
    var HOST_NAME = ""
    var PUBLIC_KEY_HASH= ""
    var ISHTTPS = false

    private var retrofit: Retrofit? = null

    private var authInterceptor : Interceptor? = null

    fun setAuthInterceptor(interceptor: Interceptor){
        authInterceptor = interceptor
    }

     fun  getClient(headers: HashMap<String, String> = HashMap()): Retrofit {
        if (retrofit == null) {

            val client = OkHttpClient().newBuilder().addInterceptor { chain: Interceptor.Chain? ->
                val original = chain?.request()
                val request = original?.newBuilder()
                        //?.header("Authorization", Authorization)
                        ?.method(original.method(), original.body())

                for(data in headers){
                    Headers.set(data.key,data.value)
                }

                for (items in Headers){
                    request?.addHeader(items.key,items.value)
                }

                chain?.proceed(request?.build()!!)
            }
            client.connectTimeout(30, TimeUnit.SECONDS);
            client.readTimeout(30, TimeUnit.SECONDS);
            client.writeTimeout(90, TimeUnit.SECONDS);

            if(authInterceptor!=null){
                client.addInterceptor(authInterceptor)
            }
            if(BASE_URL.contains("https")&& PUBLIC_KEY_HASH.isNotEmpty()) {

                val certificatePinner = CertificatePinner.Builder()
                        .add(BASE_URL.split("/").get(2), PUBLIC_KEY_HASH)
                        .build()
                client.certificatePinner(certificatePinner).build()

                val tlsSocketFactory: TLSSocketFactory

                tlsSocketFactory = TLSSocketFactory()
                client.sslSocketFactory(tlsSocketFactory, tlsSocketFactory.systemDefaultTrustManager())
            }

            val logging = HttpLoggingInterceptor()
// set your desired log level
            logging.setLevel(HttpLoggingInterceptor.Level.BODY)

// add your other interceptors …

// add logging as last interceptor
             client.addInterceptor(logging)  // <-- this is the important line!


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