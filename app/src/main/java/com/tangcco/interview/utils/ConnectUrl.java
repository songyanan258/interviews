package com.tangcco.interview.utils;

import com.tangcco.interview.bean.user;
import com.tangcco.interview.presenter.ChangeUserListener;
import com.tangcco.interview.presenter.LoginResoultListener;

import java.util.List;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.listener.UpdateListener;

/**
 * Created by YN on 2017/3/25.
 */

public class ConnectUrl<T> {
    public ConnectUrl(){

    }
    final boolean flag=true;


    //登录
    public void  login(final String username , final String password, final LoginResoultListener<T> loginResoultListener){
        final BmobQuery<user> query = new BmobQuery<user>();

        query.addWhereEqualTo("username",username)
                .addWhereEqualTo("password",password);
        query.findObjects(new FindListener<user>() {
            @Override
            public void done(List<user> list, BmobException e) {
                if(e==null){
                    Cons.isLogin=true;
                    T res = (T) list.get(0);
                    loginResoultListener.loginResoult(res,e);
                }else{
                    BmobQuery<user> second=new BmobQuery<user>();
                    second.addWhereEqualTo("phone",username)
                            .addWhereEqualTo("password",password)
                            .findObjects(new FindListener<user>() {
                                @Override
                                public void done(List<user> list, BmobException e) {
                                    if(e==null){
                                        Cons.isLogin=true;
                                        T res = (T) list.get(0);
                                        loginResoultListener.loginResoult(res,e);
                                    }else{
                                        Cons.isLogin=false;
                                    }
                                }
                            });
                }
            }
        });
    }

    //修改账户
    public void changeUser(String detailName,String detailValue,String objectId,final ChangeUserListener url){
        user mUser = new user();

        //判断修改的内容
        switch (detailName){
            case Cons.CHANGE_PASSWORD:
                mUser.setPassword(detailValue);
                break;
            case Cons.CHANGE_PHONENUM:
                mUser.setPhone(detailValue);
                break;
            case Cons.CHANGE_USERNAME:
                mUser.setUsername(detailValue);
                break;
            case Cons.CHANGE_EMAIL:
                mUser.setEmail(detailValue);
                break;
            case Cons.CHANGE_HEAD:
                mUser.setHead(detailValue);
                break;
            case Cons.CHANGE_SEX:
                mUser.setSex(detailValue);
                break;
            default:
                break;
        }
        mUser.update(objectId, new UpdateListener() {
            @Override
            public void done(BmobException e) {
                url.changeUserResoult(e);
            }
        });
    }

}
