package com.example.first_lesson;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.TableLayout;

/**
 * Created by Евгения on 12.03.2018.
 */

public class MyViewGroup extends TableLayout {

    private static final String TAG = "MyViewGroup";

    public MyViewGroup(Context context) {
        super(context);
        Log.d(TAG, "OnCreate()");
    }

    public MyViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
        Log.d(TAG, "OnCreateWithAttrSet()");
    }

    public void requestLayout() {
        super.requestLayout();
        Log.d(TAG, "RequestLayout()");
    }

    public void addView(View child) {
        super.addView(child);
        Log.d(TAG, "AddView()");
    }

    public void addView(View child, int index)
    {
        super.addView(child, index);
        Log.d(TAG, "AddViewWithIndex()");
    }

    public void addView(View child, android.view.ViewGroup.LayoutParams params) {
        super.addView(child, params);
        Log.d(TAG, "AddViewWithParams()");
    }

    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.d(TAG, "OnMeasure()");
    }

    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        Log.d(TAG, "OnLayout()");
    }
}
