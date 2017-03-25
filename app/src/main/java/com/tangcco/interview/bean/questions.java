package com.tangcco.interview.bean;

import java.util.List;

/**
 * Created by YN on 2017/3/13.
 */

public class questions {


    /**
     * results : [{"createdAt":"2017-03-13 13:42:16","title":"娴嬭瘯棰樼洰","type":"Android","userid":"\tuj13gggk","content":"娴嬭瘯鍐呭","objectId":"BxUg1115","updatedAt":"2017-03-13 13:42:40"}]
     */
    private List<ResultsEntity> results;

    public void setResults(List<ResultsEntity> results) {
        this.results = results;
    }

    public List<ResultsEntity> getResults() {
        return results;
    }

    public class ResultsEntity {
        /**
         * createdAt : 2017-03-13 13:42:16
         * title : 娴嬭瘯棰樼洰
         * type : Android
         * userid : 	uj13gggk
         * content : 娴嬭瘯鍐呭
         * objectId : BxUg1115
         * updatedAt : 2017-03-13 13:42:40
         */
        private String createdAt;
        private String title;
        private String type;
        private String userid;
        private String content;
        private String objectId;
        private String updatedAt;

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

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

        public void setObjectId(String objectId) {
            this.objectId = objectId;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public String getCreatedAt() {
            return createdAt;
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

        public String getObjectId() {
            return objectId;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }
    }
}
