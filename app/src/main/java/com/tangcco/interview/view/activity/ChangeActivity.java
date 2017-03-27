package com.tangcco.interview.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
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
    @BindView(R.id.top_snaker_reminder)
    CoordinatorLayout topSnakerReminder;

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
        changeInputPassword.getEditText().addTextChangedListener(new MinLengthTextWatcher(changeInputPassword,"密码不能少于六位"));
        changeInputRePassword.getEditText().addTextChangedListener(new MinLengthTextWatcher(changeInputRePassword,"密码不能少于六位"));
    }

    private void initData() {

    }

    private void initView() {
        judgeToInit();
        initToolbar();
        changeInputPhoneNum.setCounterEnabled(true);
        changeInputPhoneNum.setCounterMaxLength(11);
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
                switch (intent.getStringExtra(Cons.CHANGE_TYPE)){
                    case Cons.CHANGE_PASSWORD:
                        String password = changeInputPassword.getEditText().getText().toString();
                        String rePass = changeInputRePassword.getEditText().getText().toString();
                        if("".equals(password)||"".equals(rePass)){
                            Util.mToast(this,"密码不能为空");
                        }else if(!password.equals(rePass)){
                            Util.mToast(this,"两次密码不一致");
                        }else{
                            Util.mToast(this,"修改密码操作");
                            Util.mToast(this,password);
                            Util.changeUserDetail(this,Cons.CHANGE_PASSWORD,password);
                        }
                        break;
                    case Cons.CHANGE_PHONENUM:
                        String phone = changeInputPhoneNum.getEditText().getText().toString();

                        Boolean flag = Util.checkPhone(phone);
                        if(true==flag){
                            changeInputPhoneNum.setErrorEnabled(false);
                            Util.changeUserDetail(this,Cons.CHANGE_PHONENUM,phone);
                        }else{
                            changeInputPhoneNum.setErrorEnabled(true);
                            changeInputPhoneNum.setError("请输入正确的手机号");
                        }
                        break;
                    case Cons.CHANGE_USERNAME:
                        String nickname = changeInputUsername.getEditText().getText().toString();
                        Util.changeUserDetail(this,Cons.CHANGE_USERNAME,nickname);
                        break;
                }
                break;
            case android.R.id.home:
                finish();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    public void judgeToInit() {
        intent = getIntent();
        switch (intent.getStringExtra(Cons.CHANGE_TYPE)) {
            case Cons.CHANGE_PASSWORD:
                changeInputPassword.setVisibility(View.VISIBLE);
                changeInputRePassword.setVisibility(View.VISIBLE);
                changeToolbarTitle.setText("修改用户密码");

                break;
            case Cons.CHANGE_PHONENUM:
                changeInputPhoneNum.setVisibility(View.VISIBLE);
                changeToolbarTitle.setText("修改手机号码");
                break;
            case Cons.CHANGE_USERNAME:
                changeInputUsername.setVisibility(View.VISIBLE);
                changeToolbarTitle.setText("修改用户昵称");
                break;
        }
    }



    class MinLengthTextWatcher implements TextWatcher{
        private String errorStr;
        private TextInputLayout textInputLayout;
        public  MinLengthTextWatcher(TextInputLayout textInputLayout, String errorStr){
            this.textInputLayout = textInputLayout;
            this.errorStr = errorStr;
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            // 文字改变后回调
            if(textInputLayout.getEditText().getText().toString().length()>=6){
                textInputLayout.setErrorEnabled(false);
            }else{
                textInputLayout.setErrorEnabled(true);
                textInputLayout.setError(errorStr);
            }
        }
    }

}
