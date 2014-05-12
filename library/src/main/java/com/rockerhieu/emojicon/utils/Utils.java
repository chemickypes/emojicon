package com.rockerhieu.emojicon.utils;

import android.os.Build;

/**
 * Created by angelo on 12/05/14.
 */
public class Utils {
    public static boolean hasKitKat() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT;
    }
}
