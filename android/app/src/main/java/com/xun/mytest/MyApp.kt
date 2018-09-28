package com.xun.mytest

import com.xun.mytest.exflutter.AppUtils
import io.flutter.app.FlutterApplication

/**
 * @author- XUN;
 * @create- 2018/9/14;
 * @desc  -
 */
class MyApp: FlutterApplication() {

    override fun onCreate() {
        super.onCreate()

        AppUtils.init(this)
    }
}