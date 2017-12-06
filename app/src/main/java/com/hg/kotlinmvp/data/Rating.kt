package com.hg.kotlinmvp.data

/**
 * Created by HStan on 2017/3/15.
 */

data class Rating(var max: Int ,
                  var average: Double ,
                  var stars: String,
                  var min: Int ) {
    /**
     * max : 10
     * average : 8.5
     * stars : 45
     * min : 0
     */

}
