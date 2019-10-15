package com.zhang.jitgreendao;

import android.app.Application;

import com.zhang.greendao.GreenDaoDoc;

/**
 * Created by zhangyuncai on 2019/10/15.
 */
public class DemoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        GreenDaoDoc.initGreenDao(this);
    }
}
