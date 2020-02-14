var exec = require('cordova/exec');

exports.play = function (code) {
    exec(null, null, 'PlayDefaultSounds', 'play', [code]);
};
