package com.xun.mytest.exflutter

import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel

/**
 * @author- XUN;
 * @create- 2018/9/14;
 * @desc  - flutter调用安卓方法
 */
interface InterfaceFlutterChannel {

    /**
     * 处理逻辑
     */
    fun handle(methodCall: MethodCall,  result:MethodChannel.Result):Boolean
}