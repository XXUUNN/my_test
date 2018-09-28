package com.xun.mytest.exflutter

import io.flutter.plugin.common.BinaryMessenger
import io.flutter.plugin.common.MethodChannel


/**
 * @author- XUN;
 * @create- 2018/9/14;
 * @desc  -
 */
class FlutterChannelHelp {
    companion object {
        private val CHANNEL_MY = "my_channel"
        fun create(): FlutterChannelHelp {
            return FlutterChannelHelp()
        }
    }

    private var channelList: ArrayList<InterfaceFlutterChannel> = ArrayList()

    fun addChannel(channel: InterfaceFlutterChannel): FlutterChannelHelp {
        channelList.add(channel)
        return this
    }

    fun register(messenger: BinaryMessenger) {
        MethodChannel(messenger, CHANNEL_MY).setMethodCallHandler { methodCall, result ->
            channelList.forEach {
                if (it.handle(methodCall, result)){
                    return@forEach
                }
            }
        }
    }
}