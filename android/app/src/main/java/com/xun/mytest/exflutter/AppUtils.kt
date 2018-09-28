package com.xun.mytest.exflutter

import android.app.Application

/**
 * @author- XUN;
 * @create- 2018/9/14;
 * @desc  - appUtils
 */
object AppUtils {
    var application: Application? = null;

    fun init(application: Application) {
        this.application = application
    }


}