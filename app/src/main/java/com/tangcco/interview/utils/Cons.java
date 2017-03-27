package com.tangcco.interview.utils;

/**
 * Created by ThinkPad on 2017/3/1.
 */

public class Cons {

    //是否关闭菜单
    public static  boolean isClose = false;
    //跳转到修改昵称
    public static final String CHANGE_USERNAME="nickname";
    //跳转到修改手机号码
    public static final String CHANGE_PHONENUM="phoneNum";
    //跳转到修改密码
    public static final String CHANGE_PASSWORD="password";
    //修改性别
    public static final String CHANGE_SEX="sex";
    //修改头像
    public static final String CHANGE_HEAD="head";
    //修改粉丝数
    public static final String CHANGE_FUNNUM="funNum";
    //修改邮箱
    public static final String CHANGE_EMAIL="email";
    //修改关注数
    public static final String CHANGE_ATTNUM="attNumber";
    //修改发帖数
    public static final String CHANGE_FATIENUM="fatieNum";
    //跳转类型
    public static final String CHANGE_TYPE="change";
    //储存在sharePreference中的“头”

    //用户缓存
    public static final String SHARE_USER="share_user";
    public static final String USER_DETAIL="user_detail";
    //帖子缓存
    public static final String SHARE_POST="share_post";
    public static final String POST_DETAIL="post_detail";
    //关注用户缓存
    public static final String SHARE_GUANZHU="share_guanzhu";
    public static final String GUANZHU_DETAIL="guanzhu_detail";
    //粉丝用户缓存
    public static final String SHARE_FENSI="share_fensi";
    public static final String FENSI_DETAIL="fensi_detail";


    //本地不存在缓存
    public static final String NOTHING="nothing";

    //请求的地址
    public static final String CONNECT_URL="https://api.bmob.cn/1/classes";
    //请求的ID
    public static final String APPLICATION_ID="X-Bmob-Application-Id";
    public static final String APPLICATION_ID_VALUE="50ed8914e573fcf30aa522e150f977bc";

    //请求的KEY
    public static final String APPLICATION_KEY="X-Bmob-REST-API-Key";
    public static final String APPLICATION_KEY_VALUE="77177a22ed109e8640c863a743505b60";

    //请求的编码格式
    public static final String CONTENT_TYPE="Content-Type";
    public static final String CONTENT_TYPE_JSON="application/json";
    public static final String CONTENT_TYPE_GET="application/x-www-form-urlencoded";

    //用户是否登陆成功
    public static boolean isLogin=false;

    //是否自动登录
    public static final String IS_SELF_LOGIN="isSelefLogin";
    public static final String IS_SELF_LOGIN_DETAIL="isSelfLogin_detail";

    //正则表达式验证邮箱
    public static final String CHECK_EMAIL="/^[a-zA-Z0-9#_~!$&'()*+,;=:.\"(),:;<>@\\[\\]\\\\]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*$/";




}
