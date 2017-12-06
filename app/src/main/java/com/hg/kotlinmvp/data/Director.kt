package com.hg.kotlinmvp.data

/**
 * Created by HStan on 2017/3/15.
 */

data class Director(var alt: String,
                    var avatars: Images,
                    var name: String,
                    var id: String) {
    /**
     * alt : https://movie.douban.com/celebrity/1036395/
     * avatars : {"small":"http://img7.doubanio.com/img/celebrity/small/11282.jpg","large":"http://img7.doubanio.com/img/celebrity/large/11282.jpg","medium":"http://img7.doubanio.com/img/celebrity/medium/11282.jpg"}
     * name : 詹姆斯·曼高德
     * id : 1036395
     */


}
