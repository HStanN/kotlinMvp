package com.hg.kotlinmvp.http

import com.hg.kotlinmvp.data.MovieResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by HStan on 2017/12/1.
 */
interface API {

    /**
     * 正在热映的电影
     * @param city
     *
     */
    @GET("/v2/movie/in_theaters")
    fun OnShow(@Query("city") city: String): Observable<MovieResponse>
}