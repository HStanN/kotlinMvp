package com.hg.kotlinmvp.data

/**
 * Created by HStan on 2017/3/7.
 */

data class MovieResponse(var title: String,
                         var count: Int,
                         var start: Int,
                         var total: Int,
                         var subjects: List<Movie>) {

    /**
     * title : 正在上映的电影-北京
     * count : 20
     * start : 0
     * total : 28
     * subjects : []
     */

}
