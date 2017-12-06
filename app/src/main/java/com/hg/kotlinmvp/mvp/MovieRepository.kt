package com.hg.kotlinmvp.mvp

import com.hg.kotlinmvp.data.MovieResponse
import com.hg.kotlinmvp.http.API
import com.hg.kotlinmvp.http.RetrofitManager
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

/**
 * Created by HStan on 2017/12/1.
 *
 */
class MovieRepository {

    private var api:API

    init {
        val retrofit: RetrofitManager = RetrofitManager.getInstance()
        api = retrofit.init()
    }

    fun getMovieByCity(city:String,response: (MovieResponse) -> Unit) : Disposable{
       return api.OnShow(city)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    t: MovieResponse -> response(t)
                })

    }

}