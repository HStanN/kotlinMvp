package com.hg.kotlinmvp

/**
 * Created by HStan on 2017/12/1.
 */
interface HttpCallBack<T>{
    fun success(response:T)
}