package com.example.xyzreader.application;

import android.app.Application;

import com.example.xyzreader.R;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by libin on 16/2/18.
 */
public class XYZReaderApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("Rosario-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build());
    }
}
