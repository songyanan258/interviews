package com.tangcco.interview.bean;

import cn.bmob.v3.BmobObject;

/**
 * Created by YN on 2017/3/13.
 */

public class user extends BmobObject {


    public user() {

    }

    /**
     * createdAt : 2017-03-08 13:15:52
     * password : 1234
     * funNum : 1
     * phone : 13813813813
     * sex : 鐢�
     * attNumber : 1
     * objectId : uj13gggk
     * updatedAt : 2017-03-13 13:45:47
     * username : admin
     */
//    private String createdAt;
    private String password;
    private String funNum;
    private String phone;
    private String head;
    private String sex;
    private String attNumber;
//    private String objectId;
//    private String updatedAt;
    private String username;
    private String email;
    private String nickname;
    private String postNum;

    public String getPostNum() {
        return postNum;
    }

    public void setPostNum(String postNum) {
        this.postNum = postNum;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    /*public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }*/

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFunNum(String funNum) {
        this.funNum = funNum;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAttNumber(String attNumber) {
        this.attNumber = attNumber;
    }

    /*public void setObjectId(String objectId) {
        this.objectId = objectId;
    }*/

    /*public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }*/

    public void setUsername(String username) {
        this.username = username;
    }

    /*public String getCreatedAt() {
        return createdAt;
    }*/

    public String getPassword() {
        return password;
    }

    public String getFunNum() {
        return funNum;
    }

    public String getPhone() {
        return phone;
    }

    public String getSex() {
        return sex;
    }

    public String getAttNumber() {
        return attNumber;
    }

    @Override
    public String toString() {
        return "user{" +
                "password='" + password + '\'' +
                ", funNum='" + funNum + '\'' +
                ", phone='" + phone + '\'' +
                ", sex='" + sex + '\'' +
                ", attNumber='" + attNumber + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    /* public String getObjectId() {
        return objectId;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }*/

    public String getUsername() {
        return username;
    }
}
