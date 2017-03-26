package com.tangcco.interview.bean;

import cn.bmob.v3.BmobObject;

/**
 * Created by YN on 2017/3/13.
 */

public class questions extends BmobObject {


        /**
         * createdAt : 2017-03-13 13:42:16
         * title : 娴嬭瘯棰樼洰
         * type : Android
         * userid : 	uj13gggk
         * content : 娴嬭瘯鍐呭
         * objectId : BxUg1115
         * updatedAt : 2017-03-13 13:42:40
         */
        private String title;
        private String type;
        private String userid;
        private String content;


        public void setTitle(String title) {
            this.title = title;
        }
        public void setType(String type) {
            this.type = type;
        }

        public void setUserid(String userid) {
            this.userid = userid;
        }

        public void setContent(String content) {
            this.content = content;
        }
        public String getTitle() {
            return title;
        }

        public String getType() {
            return type;
        }

        public String getUserid() {
            return userid;
        }

        public String getContent() {
            return content;
        }

}
