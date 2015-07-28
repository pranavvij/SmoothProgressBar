package com.smoothprogressbar;

import android.content.Context;
import android.support.v4.widget.*;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;



public class MainActivity extends ActionBarActivity {
    RelativeLayout relativeLayout;
    private static final int CIRCLE_DIAMETER_LARGE = 56;
    private static final int CIRCLE_DIAMETER = 40;
    private static final int CIRCLE_BG_LIGHT = 0xFFFAFAFA;
    CircleImageView circleImageView;
    MaterialProgressDrawable mProgress;
    public static Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=getApplicationContext();
        relativeLayout=(RelativeLayout)findViewById(R.id.relative);

        circleImageView=new CircleImageView(getApplicationContext(),CIRCLE_BG_LIGHT,CIRCLE_DIAMETER/2);
        mProgress = new MaterialProgressDrawable(getApplicationContext(),circleImageView);
        mProgress.setBackgroundColor(CIRCLE_BG_LIGHT);
        mProgress.setProgressRotation(.7f);
        mProgress.setAlpha(255);
        mProgress.showArrow(true);
        mProgress.start();
        circleImageView.setImageDrawable(mProgress);
        relativeLayout.addView(circleImageView);
    }
}
