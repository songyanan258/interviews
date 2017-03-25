package com.tangcco.interview.view.activity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.tangcco.interview.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.third_QQ)
    TextView thirdQQ;
    @BindView(R.id.third_WebChat)
    TextView thirdWebChat;
    @BindView(R.id.third_WeiBo)
    TextView thirdWeiBo;
    @BindView(R.id.topbar_back)
    ImageView topbarBack;
    @BindView(R.id.topbar_title)
    TextView topbarTitle;
    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.btn_register)
    Button btnRegister;
    //字体图标
    private Typeface iconfont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        initView();
        initData();
        initListener();
    }

    private void initListener() {
        thirdQQ.setOnClickListener(this);
        thirdWeiBo.setOnClickListener(this);
        thirdWebChat.setOnClickListener(this);
        topbarBack.setOnClickListener(this);

    }

    private void initData() {
        thirdQQ.setTypeface(iconfont);
        thirdWebChat.setTypeface(iconfont);
        thirdWeiBo.setTypeface(iconfont);
    }

    private void initView() {
        iconfont = Typeface.createFromAsset(getAssets(), "iconfont/iconfont.ttf");
    }

    @Override
    public void onClick(View v) {

    }
}
