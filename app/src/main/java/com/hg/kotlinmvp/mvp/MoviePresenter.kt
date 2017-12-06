package com.hg.kotlinmvp.mvp

import com.hg.kotlinmvp.base.IPresenter

/**
 * Created by HStan on 2017/12/1.
 */
interface MoviePresenter : IPresenter<MovieView> {
    fun get(city:String)
}