package com.hg.kotlinmvp.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by HStan on 2017/11/30.
 */
abstract class BaseActivity<P : BasePresenterImpl<V>, V : IBaseView> : AppCompatActivity() {

    protected lateinit var mPresenter : P

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        init()
        bind()
    }

    /** get layout id **/
    abstract fun getLayoutId() : Int

    abstract fun init()

    abstract fun bind()

}