package com.dashan.apptest.utils;

import android.app.Application;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SharePreferencesUtil.init(this);
    }
}
