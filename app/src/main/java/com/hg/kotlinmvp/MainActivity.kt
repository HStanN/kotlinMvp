package com.hg.kotlinmvp

import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.hg.kotlinmvp.adapter.MovieAdapter
import com.hg.kotlinmvp.base.BaseActivity
import com.hg.kotlinmvp.data.MovieResponse
import com.hg.kotlinmvp.mvp.MoviePresenterImpl
import com.hg.kotlinmvp.mvp.MovieView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity<MoviePresenterImpl,MovieView>(),MovieView {

    lateinit var adapter:MovieAdapter

    override fun error(msg: String) {
    }

    override fun loading() {
        progressBar.visibility = View.VISIBLE
        mRecyclerView.visibility = View.GONE
    }

    override fun loaded() {
        progressBar.visibility = View.GONE
        mRecyclerView.visibility = View.VISIBLE
    }

    override fun movieUpdate(movieResponse: MovieResponse) {
        adapter = MovieAdapter(this, movieResponse.subjects)
        mRecyclerView.adapter = adapter
    }

    override fun getLayoutId(): Int {
         return R.layout.activity_main
    }

    override fun init() {
        mRecyclerView.layoutManager = LinearLayoutManager(applicationContext,LinearLayoutManager.VERTICAL,false)
        mRecyclerView.addItemDecoration(DividerItemDecoration(applicationContext,DividerItemDecoration.VERTICAL))

        mPresenter = MoviePresenterImpl()
        mPresenter.attach(this)
        mPresenter.get("杭州")
    }

    override fun bind() {
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter.detach(this)
        mPresenter.dispose()
    }
}
