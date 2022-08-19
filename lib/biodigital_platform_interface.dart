import 'package:biodigital/biodigital_options.dart';
import 'package:biodigital/biodigital_view.dart';
import 'package:plugin_platform_interface/plugin_platform_interface.dart';

abstract class BioDigitalPlatform extends PlatformInterface {
  BioDigitalPlatform() : super(token: _token);
  static final Object _token = Object();
  static BioDigitalPlatform _instance = BioDigitalView();

  static BioDigitalPlatform get instance => _instance;

  static set instance(BioDigitalPlatform instance) {
    PlatformInterface.verifyToken(instance, _token);
    _instance = instance;
  }

  Future<List> init(BioDigitalOptions options) async {
    throw UnimplementedError('init has not been implemented.');
  }
}
