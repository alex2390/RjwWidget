package com.example.sb_cm.rjwwidget;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * Desc:6affd
 * <p>
 * Created by renjiawen on 2018/12/7.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        CrashReport.initCrashReport(getApplicationContext(), "1ab5b", false);
    }
}
