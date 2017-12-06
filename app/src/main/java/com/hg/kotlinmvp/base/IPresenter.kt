package com.hg.kotlinmvp.base

/**
 * Created by HStan on 2017/11/30.
 */
interface IPresenter<V>{

    /*
    * dispose RxJava tasks
    * */
    fun dispose()

    fun attach(view : V)

    fun detach(view : V)

}