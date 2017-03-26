package com.tangcco.interview.bean;

import cn.bmob.v3.BmobObject;

/**
 * Created by YN on 2017/3/26.
 */

public class attention extends BmobObject {

    private String nickName;
    private String userid;
    private String startUserid;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getStartUserid() {
        return startUserid;
    }

    public void setStartUserid(String startUserid) {
        this.startUserid = startUserid;
    }
}
