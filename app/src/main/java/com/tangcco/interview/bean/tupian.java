package com.tangcco.interview.bean;

import cn.bmob.v3.BmobObject;

/**
 * Created by YN on 2017/3/26.
 */

public class tupian extends BmobObject {

    private String biaoName;
    private String postid;
    private String path;

    public tupian(){

    }

    public String getPostid() {
        return postid;
    }

    public void setPostid(String postid) {
        this.postid = postid;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getBiaoName() {
        return biaoName;
    }

    public void setBiaoName(String biaoName) {
        this.biaoName = biaoName;
    }
}
