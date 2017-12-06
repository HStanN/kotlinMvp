package com.hg.kotlinmvp.data

/**
 * Created by Hg on 2017/3/7.
 */

data class Movie(var rating: Rating,
                 var title: String,
                 var collect_count: Int,
                 var original_title: String,
                 var subtype: String,
                 var year: String,
                 var images: Images,
                 var alt: String,
                 var id: Int,
                 var genres: List<String>,
                 var casts: List<Director>,
                 var directors: List<Director>) {

    /**
     * rating : {"max":10,"average":8.5,"stars":"45","min":0}
     * genres : ["剧情","动作","科幻"]
     * title : 金刚狼3：殊死一战
     * casts : [{"alt":"https://movie.douban.com/celebrity/1010508/","avatars":{"small":"http://img3.doubanio.com/img/celebrity/small/22036.jpg","large":"http://img3.doubanio.com/img/celebrity/large/22036.jpg","medium":"http://img3.doubanio.com/img/celebrity/medium/22036.jpg"},"name":"休·杰克曼","id":"1010508"},{"alt":"https://movie.douban.com/celebrity/1010540/","avatars":{"small":"http://img7.doubanio.com/img/celebrity/small/50451.jpg","large":"http://img7.doubanio.com/img/celebrity/large/50451.jpg","medium":"http://img7.doubanio.com/img/celebrity/medium/50451.jpg"},"name":"帕特里克·斯图尔特","id":"1010540"},{"alt":"https://movie.douban.com/celebrity/1363476/","avatars":{"small":"http://img3.doubanio.com/img/celebrity/small/CCMOQr5bsGAcel_avatar_uploaded1476526279.97.jpg","large":"http://img3.doubanio.com/img/celebrity/large/CCMOQr5bsGAcel_avatar_uploaded1476526279.97.jpg","medium":"http://img3.doubanio.com/img/celebrity/medium/CCMOQr5bsGAcel_avatar_uploaded1476526279.97.jpg"},"name":"达芙妮·基恩","id":"1363476"}]
     * collect_count : 87749
     * original_title : Logan
     * subtype : movie
     * directors : [{"alt":"https://movie.douban.com/celebrity/1036395/","avatars":{"small":"http://img7.doubanio.com/img/celebrity/small/11282.jpg","large":"http://img7.doubanio.com/img/celebrity/large/11282.jpg","medium":"http://img7.doubanio.com/img/celebrity/medium/11282.jpg"},"name":"詹姆斯·曼高德","id":"1036395"}]
     * year : 2017
     * images : {"small":"http://img7.doubanio.com/view/movie_poster_cover/ipst/public/p2431980130.jpg","large":"http://img7.doubanio.com/view/movie_poster_cover/lpst/public/p2431980130.jpg","medium":"http://img7.doubanio.com/view/movie_poster_cover/spst/public/p2431980130.jpg"}
     * alt : https://movie.douban.com/subject/25765735/
     * id : 25765735
     */

}
