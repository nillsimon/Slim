package com.geekbrains.lesson6.slim;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

public class SlimApp extends Application {
    @SuppressLint("StaticFieldLeak")
    static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }
}
