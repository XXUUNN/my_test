import 'dart:async';

import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter/widgets.dart';
import 'package:my_test/utils/app_channel.dart';

void main() {
  runApp(HomePage());
}

class HomePage extends StatefulWidget {

  @override
  State<StatefulWidget> createState() {
    return HomePageState();
  }

}

class HomePageState extends State<HomePage> {
  static final platform = MethodChannel("my_channel");

  String _batteryLevel = "unkown battery level.";

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'channel',
      home: Scaffold(
        appBar: AppBar(title: Text('title'),),
          body: MaterialButton(onPressed: () {
        _getBatteryLevel();
      },child: Text(_batteryLevel),textColor: Colors.red,color: Colors.green,),),
    );
  }

  Future<Null> _getBatteryLevel() async {

    String batteryLevel;
    try {
      final int result = await platform.invokeMethod('getBatteryLevel',
          <String ,dynamic>{
        "content":"fffff"
      }
      );
      batteryLevel = "battery level at $result %.";
    } on PlatformException catch (e) {
      batteryLevel = "failed to get battery level : '${e.message}'";
    }
    ToastUtils.show(_batteryLevel.toString());
    setState(() {
      _batteryLevel = batteryLevel;
    });
  }
}