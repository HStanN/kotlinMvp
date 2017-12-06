package com.hg.kotlinmvp.mvp

import com.hg.kotlinmvp.base.BasePresenterImpl

/**
 * Created by HStan on 2017/12/1.
 *
 */
class MoviePresenterImpl : BasePresenterImpl<MovieView>(), MoviePresenter {

    lateinit var movieRepository: MovieRepository

    override fun get(city: String) {
        mView?.loading()
        movieRepository = MovieRepository()
        d = movieRepository.getMovieByCity(
                city,
                { response ->
                    mView?.movieUpdate(response)
                    mView?.loaded()
                }
        )
    }
}
