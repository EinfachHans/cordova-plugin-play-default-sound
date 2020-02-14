/********* PlayDefaultSounds.m Cordova Plugin Implementation *******/
#import "PlayDefaultSounds.h"
#import <AudioToolbox/AudioServices.h>
#import <Cordova/CDV.h>

@implementation PlayDefaultSounds

static NSString * const TAG = @"[PlayDefaultSounds] ";

- (void)play:(CDVInvokedUrlCommand*)command
{

    NSNumber* code = [command.arguments objectAtIndex:0];

    if(code == nil) {
        NSLog(@"%@%@", TAG, @"Code must be set");
    } else {
     AudioServicesPlaySystemSound([code unsignedIntValue]);
    }
}

@end
