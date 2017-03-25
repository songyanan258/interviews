package com.tangcco.interview.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Toast;

import okhttp3.OkHttpClient;

/**
 * Created by YN on 2017/3/19.
 */

public class Util {

    public static  OkHttpClient okHttpClient;


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



    //拼接url地址
    public static String connectUrl(String className,String objectId){
        String url = Cons.CONNECT_URL;
        url+="/"+className;
        if(null!=objectId&&!objectId.equals("")){
            url+="/"+objectId;
        }
        return url;
    }

    //首选项存储用户信息

    public  boolean putSharePreference(String userDetail,Context context){
        SharedPreferences share = context.getSharedPreferences(Cons.SHARE_USER,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = share.edit();//获取编辑器
        editor.remove(Cons.USER_DETAIL);
        editor.putString(Cons.USER_DETAIL,userDetail);
        editor.commit();

        return true;
    }

    //首选项获取用户信息
    public String getSharePreference(Context context){
        SharedPreferences share = context.getSharedPreferences(Cons.SHARE_USER,Context.MODE_PRIVATE);
        String str = share.getString(Cons.USER_DETAIL,"this userDetail is none");

        return str;
    }


}
