package com.hg.kotlinmvp.http

import com.google.gson.GsonBuilder
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.IOException

/**
 * Created by HStan on 2017/12/1.
 */
open class RetrofitManager private constructor(){
    internal val gson = GsonBuilder()
            .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
            .serializeNulls()
            .create()

    private val okHttpClient = OkHttpClient.Builder()
            .build()

    companion object {
        fun getInstance() : RetrofitManager{
            return Singleon.single
        }
    }

    private object Singleon{
        val single = RetrofitManager()
    }

    /** init retrofit **/
    open fun init() : API{
        val retrofit : Retrofit = Retrofit.Builder()
                .baseUrl("http://api.douban.com")
                .client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
        return retrofit.create(API::class.java)
    }

}