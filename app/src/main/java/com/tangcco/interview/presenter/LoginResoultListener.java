package com.tangcco.interview.presenter;

import cn.bmob.v3.exception.BmobException;

/**
 * Created by YN on 2017/3/25.
 */

public  interface LoginResoultListener<T> {
    void loginResoult(T resoult,Exception e);


}
