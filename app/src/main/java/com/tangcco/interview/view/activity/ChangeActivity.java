package com.tangcco.interview.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.tangcco.interview.R;
import com.tangcco.interview.utils.Cons;
import com.tangcco.interview.utils.Util;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ChangeActivity extends AppCompatActivity {

    @BindView(R.id.toolbar_change)
    Toolbar toolbarChange;
    @BindView(R.id.change_toolbar_title)
    TextView changeToolbarTitle;
    @BindView(R.id.change_input_username)
    TextInputLayout changeInputUsername;
    @BindView(R.id.change_input_phoneNum)
    TextInputLayout changeInputPhoneNum;
    @BindView(R.id.change_input_password)
    TextInputLayout changeInputPassword;
    @BindView(R.id.change_input_rePassword)
    TextInputLayout changeInputRePassword;

    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change);
        ButterKnife.bind(this);

        initView();
        initData();
        initListener();
    }

    private void initListener() {

    }

    private void initData() {

    }

    private void initView() {
        judgeToInit();
        initToolbar();

    }

    public void initToolbar() {
        setSupportActionBar(toolbarChange);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setHomeAsUpIndicator(R.mipmap.ic_chevron_left_white_36dp);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.change_detail, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.change_toolbar_commit:
                Util.mToast(this, "提交按钮");
                break;
            case android.R.id.home:
                finish();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    public void judgeToInit(){
        intent = getIntent();
        switch (intent.getStringExtra(Cons.CHANGE_TYPE)){
            case Cons.CHANGE_PASSWORD:
                changeInputPassword.setVisibility(View.VISIBLE);
                changeInputRePassword.setVisibility(View.VISIBLE);
                break;
            case Cons.CHANGE_PHONENUM:
                changeInputPhoneNum.setVisibility(View.VISIBLE);
                break;
            case Cons.CHANGE_USERNAME:
                changeInputUsername.setVisibility(View.VISIBLE);
                break;
        }
    }

}
