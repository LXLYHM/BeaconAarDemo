package com.dawnling.beaconaar;

import android.app.Application;

import com.keytop.arfindcar.ktutils.KTUtils;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        KTUtils.init(this);
    }
}
