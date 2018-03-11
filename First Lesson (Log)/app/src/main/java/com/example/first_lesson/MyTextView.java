package com.example.first_lesson;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.util.Log;

/**
 * Created by Евгения on 05.03.2018.
 */

public class MyTextView extends AppCompatTextView {

    private static final String TAG = "MyTextView";

    public MyTextView(Context context) {
        super(context);
        Log.d(TAG, "OnCreate()");
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs, android.R.attr.textViewStyle);
        Log.d(TAG, "OnCreateWithAttrSet()");
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Log.d(TAG, "OnCreateWithArrtSetAndStyles()");
    }

    @Override
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Log.d(TAG, "OnChange()");
    }

    @Override
    protected void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter) {
        super.onTextChanged(text, start, lengthBefore, lengthAfter);
        Log.d(TAG, "OnTextChange()");
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
       super.onLayout(changed, left, top, right, bottom);
       Log.d(TAG, "OnLayout()");
    }

    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.d(TAG, "OnMeasure()");
    }

    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Log.d(TAG, "DispatchDraw()");
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.d(TAG, "OnDraw()");
    }
}
