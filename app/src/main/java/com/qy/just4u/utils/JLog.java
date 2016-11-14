package com.qy.just4u.utils;

import android.util.Log;

/**
 * 此项目的log类
 * Created by abc on 2016/11/14.
 */

public class JLog {
    private static final String TAG = "J4U";
    /**
     * log开关,默认开启
     */
    private static final boolean LOG = true;

    public static void i(String content) {
        if (LOG) {
            Log.i(TAG, content);
        }
    }

    public static void e(String content) {
        if (LOG) {
            Log.i(TAG, content);
        }
    }

    public static void d(String content) {
        if (LOG) {
            Log.i(TAG, content);
        }
    }

    public static void w(String content) {
        if (LOG) {
            Log.i(TAG, content);
        }
    }

    public static void v(String content) {
        if (LOG) {
            Log.i(TAG, content);
        }
    }

}
