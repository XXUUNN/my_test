package com.xun.mytest

import android.os.Bundle
import com.xun.mytest.exflutter.BatteryChannel
import com.xun.mytest.exflutter.FlutterChannelHelp
import com.xun.mytest.exflutter.ToastChannel
import io.flutter.app.FlutterActivity
import io.flutter.plugins.GeneratedPluginRegistrant



class MainActivity() : FlutterActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FlutterChannelHelp.create().addChannel(BatteryChannel()).addChannel(ToastChannel()).register(flutterView)
        GeneratedPluginRegistrant.registerWith(this)

    }

}
