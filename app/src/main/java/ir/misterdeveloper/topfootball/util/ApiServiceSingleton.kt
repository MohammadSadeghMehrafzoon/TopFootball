package ir.misterdeveloper.topfootball.util

import ir.misterdeveloper.topfootball.model.api.ApiService
import okhttp3.OkHttpClient
import okhttp3.Request
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object ApiServiceSingleton {

    var apiService: ApiService? = null
        get() {

            if (field == null) {


                val client = OkHttpClient.Builder().addInterceptor { chain ->
                    val newRequest: Request = chain.request().newBuilder()
                        .addHeader("X-Auth-Token", "aa3d9b4b9721440bb61e0751cad07cad")
                        .build()
                    chain.proceed(newRequest)
                }.followRedirects(false)
                    .followSslRedirects(false)
                    .build()


                val retrofit = Retrofit.Builder().baseUrl(BASE_URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build()
                apiService = retrofit.create(ApiService::class.java)


            }

            return field
        }
}