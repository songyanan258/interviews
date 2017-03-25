package com.tangcco.interview.presenter.impl;

import android.os.Handler;
import android.os.Message;

import com.tangcco.interview.presenter.WelcomePresenter;


/**
 * Created by ThinkPad on 2017/3/1.
 */

public class WelcomePresenterImpl implements WelcomePresenter {

    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what){
                case WelcomePresenter.TOMAINACTIVITY:
                /**
                 * 具体的实现
                 * */
            }
        }
    };

    @Override
    public Handler getHandler() {
        return handler;
    }
}
