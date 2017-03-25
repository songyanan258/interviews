package com.tangcco.interview.base;

import android.app.Activity;
import android.os.Bundle;

import com.tangcco.interview.base.system.TaskManager;

import butterknife.ButterKnife;


/**
 * Created by ThinkPad on 2017/3/1.
 */

public abstract class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        initView();
        initData();
        initListener();
        TaskManager.getTaskManager().addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        TaskManager.getTaskManager().removeActivity(this);
    }

    protected abstract void initView();

    protected abstract void initData();

    protected abstract void initListener();
}
