package com.tangcco.interview.view.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.tangcco.interview.R;
import com.tangcco.interview.bean.user;
import com.tangcco.interview.presenter.LoginResoultListener;
import com.tangcco.interview.utils.ConnectUrl;
import com.tangcco.interview.utils.Cons;
import com.tangcco.interview.utils.Util;
import com.tangcco.interview.view.fragment.LianxiFragment;
import com.tangcco.interview.view.fragment.shangchuanFragment;
import com.tangcco.interview.view.fragment.tikuFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.bmob.v3.Bmob;
import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @BindView(R.id.viewpager)
    ViewPager viewpager;
    @BindView(R.id.iv_tiku)
    ImageView ivTiku;
    @BindView(R.id.tv_tiku)
    TextView tvTiku;
    @BindView(R.id.iv_lianxi)
    ImageView ivLianxi;
    @BindView(R.id.tv_lianxi)
    TextView tvLianxi;
    @BindView(R.id.iv_shangchuan)
    ImageView ivShangchuan;
    @BindView(R.id.tv_shangchuan)
    TextView tvShangchuan;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.dl_left)
    DrawerLayout dlLeft;
    @BindView(R.id.ll_tiku)
    LinearLayout llTiku;
    @BindView(R.id.ll_lianxi)
    LinearLayout llLianxi;
    @BindView(R.id.ll_shangchuan)
    LinearLayout llShangchuan;
    @BindView(R.id.draw_check_detail)
    ImageView drawCheckDetail;
    @BindView(R.id.draw_email)
    TextView drawEmail;
    @BindView(R.id.draw_ll_shoucang)
    LinearLayout drawLlShoucang;
    @BindView(R.id.draw_ll_guanzhu)
    LinearLayout drawLlGuanzhu;
    @BindView(R.id.draw_ll_setting)
    LinearLayout drawLlSetting;
    @BindView(R.id.draw_ll_pingfen)
    LinearLayout drawLlPingfen;
    @BindView(R.id.draw_ll_guanyu)
    LinearLayout drawLlGuanyu;
    @BindView(R.id.draw_ll_call)
    LinearLayout drawLlCall;
    @BindView(R.id.draw_circle_head)
    CircleImageView drawCircleHead;
    @BindView(R.id.draw_username)
    TextView drawUsername;

    //Intent
    private Intent intent;
    //返回键
    private ActionBarDrawerToggle mDrawerToggle;
    //碎片布局
    private Fragment lianxi_fragment = new LianxiFragment();
    private Fragment shangchuan_fragment = new shangchuanFragment();
    private Fragment tiku_fragment = new tikuFragment();
    private ArrayList<Fragment> arrayFrag = new ArrayList<Fragment>();
    //碎片适配器
    private FragmentPagerAdapter frgAdapter;
    //用户信息
    private user mUser;
    //本地用户信息是否存在
    private Boolean isSelfLogin=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Bmob.initialize(this,"50ed8914e573fcf30aa522e150f977bc");
        initView();
        initData();
        initListener();


    }

    public void initView() {
        initFragment();
        changeButtom(0);
        intent = new Intent();
    }

    public void initData() {
        this.setToolbar();
        if(Cons.isLogin==true){
            this.initUserDetail();
        }else{
            this.loadLogin("admin","123465");
        }
//       testChangeUser();





    }

    public void initListener() {
        llLianxi.setOnClickListener(this);
        llTiku.setOnClickListener(this);
        llShangchuan.setOnClickListener(this);
        drawCheckDetail.setOnClickListener(this);
        drawLlCall.setOnClickListener(this);
        drawLlGuanyu.setOnClickListener(this);
        drawLlGuanzhu.setOnClickListener(this);
        drawLlPingfen.setOnClickListener(this);
        drawLlSetting.setOnClickListener(this);
        drawLlShoucang.setOnClickListener(this);
        drawEmail.setOnClickListener(this);
        fragmentListener();

    }

    private void setToolbar() {
        toolbar.setTitle("测试标题");
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));
        setSupportActionBar(toolbar);


        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        initDrawTaggle();

    }

    private void initDrawTaggle() {
        //创建返回键，并实现打开关/闭监听
        mDrawerToggle = new ActionBarDrawerToggle(this, dlLeft, toolbar,
                R.string.draw_open, R.string.draw_close) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };
        mDrawerToggle.syncState();
        dlLeft.setDrawerListener(mDrawerToggle);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            //练习
            case R.id.ll_lianxi:
                changeButtom(1);
                viewpager.setCurrentItem(1);
                break;
            //上传
            case R.id.ll_shangchuan:
                changeButtom(2);
                viewpager.setCurrentItem(2);
                break;
            //题库
            case R.id.ll_tiku:
                changeButtom(0);
                viewpager.setCurrentItem(0);
                break;
            //用户信息
            case R.id.draw_check_detail:
                intent.setClass(this, UserDetailActivity.class);
                startActivity(intent);
                break;

            //用户邮箱
            case R.id.draw_email:
                Util.mToast(this, "用户邮箱");
                break;
            //收藏
            case R.id.draw_ll_shoucang:
                intent.setClass(this, ShoucangActivity.class);
                startActivity(intent);
                break;
            //关注
            case R.id.draw_ll_guanzhu:
                intent.setClass(this, GuanzhuActivity.class);
                startActivity(intent);
                break;
            //设置
            case R.id.draw_ll_setting:
                intent.setClass(this, ShezhiActivity.class);
                startActivity(intent);
                break;
            //评分
            case R.id.draw_ll_pingfen:
                intent.setClass(this, OtherActivity.class);
                startActivity(intent);
                break;
            //关于
            case R.id.draw_ll_guanyu:
                intent.setClass(this, OtherActivity.class);
                startActivity(intent);
                break;
            default:

                break;
        }
    }

    public void initFragment() {
        arrayFrag.add(tiku_fragment);
        arrayFrag.add(lianxi_fragment);
        arrayFrag.add(shangchuan_fragment);
        frgAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return arrayFrag.get(position);
            }

            @Override
            public int getCount() {
                return arrayFrag.size();
            }
        };
        viewpager.setAdapter(frgAdapter);
    }

    public void fragmentListener() {
        viewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset,
                                       int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                changeButtom(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    public void changeButtom(int position) {

        switch (position) {
            case 0:
                resetColor();
                ivTiku.setImageResource(R.mipmap.ic_school_grey600_24dp);
                tvTiku.setTextColor(Color.parseColor("#767676"));
                break;
            case 1:
                resetColor();
                ivLianxi.setImageResource(R.mipmap.ic_insert_drive_file_grey600_24dp);
                tvLianxi.setTextColor(Color.parseColor("#767676"));
                break;
            case 2:
                resetColor();
                ivShangchuan.setImageResource(R.mipmap.ic_cloud_upload_grey600_24dp);
                tvShangchuan.setTextColor(Color.parseColor("#767676"));
                break;
            default:
                break;
        }
    }

    public void resetColor() {
        ivTiku.setImageResource(R.mipmap.ic_school_black_24dp);
        ivShangchuan.setImageResource(R.mipmap.ic_cloud_upload_black_24dp);
        ivLianxi.setImageResource(R.mipmap.ic_insert_drive_file_black_24dp);
        tvTiku.setTextColor(Color.parseColor("#212121"));
        tvShangchuan.setTextColor(Color.parseColor("#212121"));
        tvLianxi.setTextColor(Color.parseColor("#212121"));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_search:
                Util.mToast(this, "搜索框");
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void loadLogin(String username,String password) {
        ConnectUrl<user> url = new ConnectUrl<user>();
        Bmob.initialize(this,Cons.APPLICATION_ID);
        Util.mToast(this,"进入登录方法");
        Bmob.initialize(this,Cons.APPLICATION_ID);
        url.login(username, password, new LoginResoultListener<user>() {
            @Override
            public void loginResoult(user resoult, Exception e) {
                   Util.putSharePreference(Cons.SHARE_USER,Cons.USER_DETAIL,Util.toJson(resoult),MainActivity.this);

                    user users = Util.getLocalUser(MainActivity.this);
                    Glide.with(MainActivity.this)
                            .load(users.getHead())
                            .into(drawCircleHead);
                    drawUsername.setText(users.getNickname());
                    drawEmail.setText(users.getEmail());

            }
        });
    }
    //加载本地用户信息

    public void initUserDetail(){
        isSelfLogin = Util.getIsSelfLogin(this);
        if(true==isSelfLogin){
            mUser = Util.getLocalUser(this);
            Glide.with(MainActivity.this)
                    .load(mUser.getHead())
                    .into(drawCircleHead);
            drawUsername.setText(mUser.getNickname());
            drawEmail.setText(mUser.getEmail());
            Log.i("synnn",mUser.toString());
        }

    }

    //测试修改用户信息
    public void testChangeUser(){
        Util.changeUserDetail(this,Cons.CHANGE_PASSWORD,"123465");
    }

}
