#import "BiodigitalPlugin.h"
#if __has_include(<biodigital/biodigital-Swift.h>)
#import <biodigital/biodigital-Swift.h>
#else
// Support project import fallback if the generated compatibility header
// is not copied when this plugin is created as a library.
// https://forums.swift.org/t/swift-static-libraries-dont-copy-generated-objective-c-header/19816
#import "biodigital-Swift.h"
#endif

@implementation BiodigitalPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftBiodigitalPlugin registerWithRegistrar:registrar];
}
@end
