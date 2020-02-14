var plugin = function () {
  return window.PlayDefaultSounds;
};
var PlayDefaultSounds = /** @class */ (function () {
  function PlayDefaultSounds() {
  }

  PlayDefaultSounds.play = function (code) {
    var plu = plugin();
    return plu.play.apply(plu, arguments);
  };

  return PlayDefaultSounds;
}());
export default PlayDefaultSounds;
