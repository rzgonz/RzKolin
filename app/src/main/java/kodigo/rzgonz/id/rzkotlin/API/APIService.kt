package kodigo.rzgonz.id.rzkotlin.API

import io.reactivex.Observable
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


/**
 * Created by rzgonz on 8/2/17.
 */

interface APIService {
    @GET("category/all_category/")
    fun getCategory(): Call<APIModelArray>

    @GET("movie/{id}")
    fun getMovieDetails(@Path("id") id: Int, @Query("api_key") apiKey: String): Call<APIModel>


    @GET("DroidListCore/")
    fun getHttps(): Call<Any>

    @GET("category/all_category/")
    fun rxCOba(): Observable<Response<APIModelArray>>


}