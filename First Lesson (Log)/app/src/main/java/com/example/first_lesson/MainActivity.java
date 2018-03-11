package com.example.first_lesson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "OnCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "OnStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "OnStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "OnDestroy()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "OnResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "OnPause()");
    }
}
