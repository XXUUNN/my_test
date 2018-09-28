package com.xun.mytest.exflutter

import android.widget.Toast
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel

/**
 * @author- XUN;
 * @create- 2018/9/14;
 * @desc  - toast的安卓调用
 */
class ToastChannel :InterfaceFlutterChannel{
    override fun handle(methodCall: MethodCall, result: MethodChannel.Result):Boolean {

        when(methodCall.method){
            METHOD_NAME-> Toast.makeText(AppUtils.application,methodCall.argument<String>("msg"),Toast.LENGTH_LONG).show()
        }
        result.success(null)
        return true
    }

    val METHOD_NAME = "toast"




}