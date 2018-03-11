package com.example.first_lesson;

import android.app.Application;
import android.util.Log;

/**
 * Created by Евгения on 12.03.2018.
 */

public class MyApplication extends Application {

    private static final String TAG = "MyApplication";

    public MyApplication() {
        super();
        Log.d(TAG, "Constructor()");
    }

    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "OnCreate()");
    }

    public void onTerminate() {
        super.onTerminate();
        Log.d(TAG, "OnTerminate()");
    }

}
