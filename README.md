# PlayDefaultSounds
A Cordova plugin to play default system Sounds (Android and iOS)

## Installation

```
    $ cordova plugin add cordova-plugin-play-default-sounds
```

## Usage

The Plugin is accessible via a global `window.PlayDefaultSounds` Variable or the build in Ionic Wrapper:

```
import PlayDefaultSounds from 'cordova-plugin-play-default-sounds';
``` 

## Api

### play
#### Variables
- code (optional, but needed for ios (See Overview [here](http://iphonedevwiki.net/index.php/AudioServices)))

This function plays the default Notification Sound for Android. For iOS the Code is used.

```
// Android:
PlayDefaultSounds.play();

// iOS
PlayDefaultSounds.play(1003);
``` 

## Troubles?
If you have any Problems or need help, feel free to [open an Issue](https://github.com/EinfachHans/cordova-plugin-play-default-sound/issues)!
