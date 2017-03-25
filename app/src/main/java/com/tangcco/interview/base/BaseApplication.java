package com.tangcco.interview.base;

import android.app.Application;
import android.content.Context;

/**
 * Created by ThinkPad on 2017/3/1.
 * application基类
 */

public class BaseApplication extends Application {

    private static Context mContext ;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }

    public static Context getMainContext(){
        return mContext;
    }
}
