package com.tangcco.interview.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Toast;

import com.google.gson.Gson;
import com.tangcco.interview.bean.user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.UpdateListener;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by YN on 2017/3/19.
 */

public class Util {

//    public static  OkHttpClient okHttpClient;


    public static void mToast (Context context,String text){
        Toast.makeText(context,text,Toast.LENGTH_LONG).show();
    }

    //SnackBar通知框

    public static void mSnack(final Context context,CoordinatorLayout coordinatorLayout,String message,
                              String action,final String tost){
        Snackbar.make(coordinatorLayout,message,Snackbar.LENGTH_LONG)
                .setAction(action, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context,tost,Toast.LENGTH_LONG).show();
                    }
                }).show();

    }

    //首选项存储信息

    public static   boolean putSharePreference(String type,String shareName, String detail,Context context){
        SharedPreferences share = context.getSharedPreferences(type, MODE_PRIVATE);
        SharedPreferences.Editor editor = share.edit();//获取编辑器
        editor.putString(shareName,detail);
        editor.commit();

        return true;
    }
    //首选项获取信息
    public static  String getSharePreference(String type,String shareName,Context context){
        SharedPreferences share = context.getSharedPreferences(type, MODE_PRIVATE);
        String str = share.getString(shareName,Cons.NOTHING);
        return str;
    }
    //将User转化为JSON
    public static  String toJson(user mUser){
        Gson gson = new Gson();
        return gson.toJson(mUser,user.class);
    }
    //设置是否自动登陆
    public static void setIsSelfLogin(Context context,boolean flag){
        SharedPreferences share = context.getSharedPreferences(Cons.IS_SELF_LOGIN,MODE_PRIVATE);
        SharedPreferences.Editor editor = share.edit();//获取编辑器
        editor.putBoolean(Cons.IS_SELF_LOGIN_DETAIL,flag);
        editor.apply();
    }
    //获取是否自动登陆
    public static Boolean getIsSelfLogin(Context context){
        SharedPreferences sharedPreferences = context.getSharedPreferences(Cons.IS_SELF_LOGIN,MODE_PRIVATE);
        return sharedPreferences.getBoolean(Cons.IS_SELF_LOGIN_DETAIL,true);
    }

    //获取本地用户

    public static user getLocalUser(Context context){
        user users = null;
        String str = getSharePreference(Cons.SHARE_USER,Cons.USER_DETAIL,context);
        if(Cons.NOTHING.equals(str)){
            return null;
        }else{
            Gson gson = new Gson();
            return gson.fromJson(str,user.class);
        }
    }

    //修改用户信息

    public static void changeUserDetail(final Context context,String type,String detail){
        Bmob.initialize(context,Cons.APPLICATION_ID);
        user mUser = Util.getLocalUser(context);
        switch (type){
            //修改性别
            case Cons.CHANGE_SEX:
                mUser.setSex(detail);
                mUser.update(mUser.getObjectId(), new UpdateListener() {
                    @Override
                    public void done(BmobException e) {
                        if(e==null){
                            mToast(context,"更新成功");
                        }else{
                            mToast(context,e.getMessage()+e.getErrorCode());
                        }
                    }
                });
                Util.putSharePreference(Cons.SHARE_USER,Cons.USER_DETAIL,Util.toJson(mUser),
                        context);
                break;
            //修改粉丝数
            case Cons.CHANGE_FUNNUM:

                break;

            //修改关注数
            case Cons.CHANGE_ATTNUM:

                break;
            //修改昵称
            case Cons.CHANGE_USERNAME:
                mUser.setNickname(detail);
                mUser.update(mUser.getObjectId(), new UpdateListener() {
                    @Override
                    public void done(BmobException e) {
                        if(e==null){
                            mToast(context,"更新成功");
                        }else{
                            mToast(context,e.getMessage()+e.getErrorCode());
                        }
                    }
                });
                Util.putSharePreference(Cons.SHARE_USER,Cons.USER_DETAIL,Util.toJson(mUser),
                        context);
                break;
            //修改手机号
            case Cons.CHANGE_PHONENUM:
                mUser.setPhone(detail);
                mUser.update(mUser.getObjectId(), new UpdateListener() {
                    @Override
                    public void done(BmobException e) {
                        if(e==null){
                            mToast(context,"更新成功");
                        }else{
                            mToast(context,e.getMessage()+e.getErrorCode());
                        }
                    }
                });
                Util.putSharePreference(Cons.SHARE_USER,Cons.USER_DETAIL,Util.toJson(mUser),
                        context);
                break;
            //修改头像
            case Cons.CHANGE_HEAD:

                break;
            //修改密码
            case Cons.CHANGE_PASSWORD:
                mUser.setPassword(detail);
                mUser.update(mUser.getObjectId(), new mUpdateListener());
                Util.putSharePreference(Cons.SHARE_USER,Cons.USER_DETAIL,Util.toJson(mUser),
                        context);
                break;
            //修改发帖数
            case Cons.CHANGE_FATIENUM:

                break;
        }


    }

    static class mUpdateListener extends UpdateListener{
        public mUpdateListener(){
        }
        @Override
        public void done(BmobException e) {

        }
    }

    //正则表达式验证手机号
    public static Boolean checkPhone(String phone){
        String regExp = "^[1]([3|4|5|7|8][0-9]{1}|59|58|88|89)[0-9]{8}$";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(phone);
        return m.find();
    }


}



