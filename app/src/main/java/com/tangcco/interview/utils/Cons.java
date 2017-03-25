package com.tangcco.interview.utils;

/**
 * Created by ThinkPad on 2017/3/1.
 */

public class Cons {
    //是否关闭菜单
    public static  boolean isClose = false;
    //跳转到修改昵称
    public static final String CHANGE_USERNAME="username";
    //跳转到修改手机号码
    public static final String CHANGE_PHONENUM="phoneNum";
    //跳转到修改密码
    public static final String CHANGE_PASSWORD="password";
    //跳转类型
    public static final String CHANGE_TYPE="change";
    //储存在sharePreference中的“头”
    public static final String SHARE_USER="share_user";
    public static final String USER_DETAIL="user_detail";

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




}
