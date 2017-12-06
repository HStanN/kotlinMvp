package com.hg.kotlinmvp

import android.content.Context
import android.widget.Toast

/**
 * Created by HStan on 2017/11/30.
 *
 */
fun Context.showToast(msg : String){
    Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
}