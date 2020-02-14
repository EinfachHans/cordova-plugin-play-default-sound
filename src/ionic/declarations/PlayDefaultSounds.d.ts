declare module 'cordova-plugin-play-default-sounds' {

    export default class PlayDefaultSounds {

        /**
         * Play Sound
         *
         * @ios Code from: http://iphonedevwiki.net/index.php/AudioServices
         * @android: Default Notification Sound is used
         *
         * @param code
         */
        static play(code?: number);
    }

}
