import 'dart:async';
import 'package:biodigital/biodigital_options.dart';
import 'package:biodigital/biodigital_platform_interface.dart';
import 'package:flutter/services.dart';

class BioDigitalView extends BioDigitalPlatform {
  final MethodChannel channel = const MethodChannel('biodigital');

  @override
  Future<List> init(BioDigitalOptions options) async {
    Map<String, String?> optionsMap = <String, String?>{};

    if (options.model != null) {
      optionsMap.putIfAbsent("model", () => options.model!);
    }

    return await channel
        .invokeMethod<List>('init', optionsMap)
        .then<List>((List? value) => value ?? List.empty());
  }
}
