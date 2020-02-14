package de.hanskrywaa;

import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.LOG;
import org.json.JSONArray;
import org.json.JSONException;

public class PlayDefaultSounds extends CordovaPlugin {

    private static final String LOG_TAG = "[PlayDefaultSound]";
    private static final String ACTION_PLAY = "play";


    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals(ACTION_PLAY)) {
            this.play();
            return true;
        }
        return false;
    }

    /**
     * Beep plays the default notification ringtone.
     */
    private void play() {
        cordova.getThreadPool().execute(new Runnable() {
            public void run() {
                Uri ringtone = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
                Ringtone notification = RingtoneManager.getRingtone(cordova.getActivity().getBaseContext(), ringtone);

                // If phone is not set to silent mode
                if (notification != null) {
                    notification.play();
                    LOG.d(LOG_TAG, "Sound played");
                } else {
                    LOG.d(LOG_TAG, "Phone is silent");
                }
            }
        });
    }
}
