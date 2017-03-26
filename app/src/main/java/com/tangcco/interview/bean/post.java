package com.tangcco.interview.bean;

import cn.bmob.v3.BmobObject;

/**
 * Created by YN on 2017/3/13.
 */

public class post extends BmobObject {

        private String contents;
        private String title;
        private String userid;


        public void setContents(String contents) {
            this.contents = contents;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setUserid(String userid) {
            this.userid = userid;
        }


        public String getContents() {
            return contents;
        }

        public String getTitle() {
            return title;
        }

        public String getUserid() {
            return userid;
        }
}
