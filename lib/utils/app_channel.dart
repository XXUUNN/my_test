import 'package:flutter/services.dart';

class MyChannel {
  static final platform = MethodChannel("my_channel");
}

class ToastUtils {
  static final METHOD_NAME = "toast";

  static void show(String msg) async {
    try {
      await MyChannel.platform
          .invokeMethod(METHOD_NAME, <String, String>{"msg": msg});
    } on PlatformException catch (e) {
      print(e.message);
    }
  }
}
