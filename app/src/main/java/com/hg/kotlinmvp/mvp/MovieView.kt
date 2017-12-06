package com.hg.kotlinmvp.mvp

import com.hg.kotlinmvp.base.IBaseView
import com.hg.kotlinmvp.data.MovieResponse

/**
 * Created by HStan on 2017/12/1.
 */
interface MovieView : IBaseView{
    fun movieUpdate(movieResponse: MovieResponse)
}