package com.hg.kotlinmvp.base

import io.reactivex.disposables.Disposable

/**
 * Created by HStan on 2017/11/30.
 */
open class BasePresenterImpl<V> : IPresenter<V> {

    var mView: V? = null

    var d: Disposable? = null

    override fun dispose() {
        if (d != null && !d!!.isDisposed) {
            d!!.dispose()
        }
    }

    override fun attach(view: V) {
        mView = view
    }

    override fun detach(view: V) {
        mView = null
    }

}