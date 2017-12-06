package com.hg.kotlinmvp.base

/**
 * Created by HStan on 2017/11/30.
 *
 */
interface IBaseView {

    fun loading()

    fun loaded()

    fun error(msg:String)
}