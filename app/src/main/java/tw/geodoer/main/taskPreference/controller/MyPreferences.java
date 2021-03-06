package tw.geodoer.main.taskPreference.controller;

import android.content.SharedPreferences;

public class MyPreferences {

    // SharedPreferences preferences;
    public static SharedPreferences mPreferences;

    private MyPreferences() {
    }

    // isServiceOn
    public static boolean IS_SERVICE_ON() {
        return mPreferences.getBoolean("isServiceOn", false);
    }

    ;

    // isServiceOn
    public static boolean IS_SORTING_ON() {
        return mPreferences.getBoolean("isSortingOn", false);
    }

    ;

    // isServiceOn
    public static String getUpdatePeriod() {
        return mPreferences.getString("GetPriorityPeriod", "5000");
    }

    ;

    // debug msg on/off, read from Shared Preferences XML file
    public static boolean IS_DEBUG_MSG_ON() {
        return mPreferences.getBoolean("isDebugMsgOn", true);
    }

    // 讀取設定值valueRadiatedDistance 定義靠近距離(公尺)
    public static int getValueOfRadiatedDistance() {
        return Integer.valueOf(mPreferences.getString("valueRadiatedDistance", "500"));
    }


    public static class GpsSetting {
        // GPS超時關閉改用wifi
        public static final int TIMEOUT_SEC = 5;
        // 移動距離
        public static final double GpsTolerateErrorDistance = 1.5;
        // Gps狀態
        public static boolean GpsStatus = false;

    }
}
