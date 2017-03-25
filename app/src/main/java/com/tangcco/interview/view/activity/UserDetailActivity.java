package com.tangcco.interview.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.tangcco.interview.R;
import com.tangcco.interview.utils.Cons;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import de.hdodenhof.circleimageview.CircleImageView;

public class UserDetailActivity extends AppCompatActivity {


    @BindView(R.id.coord_bottom)
    CoordinatorLayout coordBottom;
    @BindView(R.id.toolbar_detail)
    Toolbar toolbar;
    @BindView(R.id.toolbar_username)
    TextView toolbarUsername;
    @BindView(R.id.tv_num_fensi)
    TextView tvNumFensi;
    @BindView(R.id.userdetail_num_fensi)
    LinearLayout userdetailNumFensi;
    @BindView(R.id.tv_num_fatie)
    TextView tvNumFatie;
    @BindView(R.id.userdetail_num_fatie)
    LinearLayout userdetailNumFatie;
    @BindView(R.id.tv_num_guanzhu)
    TextView tvNumGuanzhu;
    @BindView(R.id.userdetail_ll_guanzhu)
    LinearLayout userdetailLlGuanzhu;
    @BindView(R.id.rl_head)
    RelativeLayout rlHead;
    @BindView(R.id.detail_iv_nicheng)
    ImageView detailIvNicheng;
    @BindView(R.id.detail_iv_sex)
    ImageView detailIvSex;
    @BindView(R.id.detail_iv_phoneNum)
    ImageView detailIvPhoneNum;
    @BindView(R.id.detail_iv_changePass)
    ImageView detailIvChangePass;
    @BindView(R.id.userdetail_circle_head)
    CircleImageView userdetailCircleHead;
    @BindView(R.id.btn_concal)
    Button btnConcal;

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);
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
        initToolbar();

    }

    private void initToolbar() {

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.mipmap.ic_chevron_left_white_36dp);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);

    }


    @OnClick({R.id.btn_concal,R.id.userdetail_circle_head, R.id.userdetail_num_fensi, R.id.userdetail_num_fatie, R.id.userdetail_ll_guanzhu, R.id.detail_iv_nicheng, R.id.detail_iv_sex, R.id.detail_iv_phoneNum, R.id.detail_iv_changePass})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.userdetail_num_fensi:
                //粉丝数点击事件
                break;
            case R.id.userdetail_num_fatie:
                //发帖点击事件
                break;
            case R.id.userdetail_ll_guanzhu:
                //关注点击事件
                break;
            case R.id.detail_iv_nicheng:
                //昵称点击事件
                intent = new Intent(this,ChangeActivity.class);
                intent.putExtra(Cons.CHANGE_TYPE,Cons.CHANGE_USERNAME);
                startActivity(intent);
                break;
            case R.id.detail_iv_sex:
                //性别点击事件
                break;
            case R.id.detail_iv_phoneNum:
                //手机号码点击事件
                intent = new Intent(this,ChangeActivity.class);
                intent.putExtra(Cons.CHANGE_TYPE,Cons.CHANGE_PHONENUM);
                startActivity(intent);
                break;
            case R.id.detail_iv_changePass:
                //修改密码点击事件
                intent = new Intent(this,ChangeActivity.class);
                intent.putExtra(Cons.CHANGE_TYPE,Cons.CHANGE_PASSWORD);
                startActivity(intent);
                break;
            case R.id.userdetail_circle_head:
                //圆形头像点击事件
                break;
            case R.id.btn_concal:
                //退出按钮点击事件
                break;
        }
    }


}
