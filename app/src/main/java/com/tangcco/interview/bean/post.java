package com.tangcco.interview.bean;

import java.util.List;

/**
 * Created by YN on 2017/3/13.
 */

public class post {

    /**
     * results : [{"createdAt":"2017-03-13 13:40:36","contents":"娴嬭瘯鍐呭","title":"娴嬭瘯甯栧瓙","userid":"\tuj13gggk","objectId":"QajGOOO3","updatedAt":"2017-03-13 13:41:09"},{"upId":"QajGOOO3","createdAt":"2017-03-13 13:41:29","contents":"娴嬭瘯鍥炲","title":"娴嬭瘯鍥炲","userid":"uj13gggk","objectId":"09e5RRRb","updatedAt":"2017-03-13 13:41:53"}]
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
         * createdAt : 2017-03-13 13:40:36
         * contents : 娴嬭瘯鍐呭
         * title : 娴嬭瘯甯栧瓙
         * userid : 	uj13gggk
         * objectId : QajGOOO3
         * updatedAt : 2017-03-13 13:41:09
         */
        private String createdAt;
        private String contents;
        private String title;
        private String userid;
        private String objectId;
        private String updatedAt;

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public void setContents(String contents) {
            this.contents = contents;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setUserid(String userid) {
            this.userid = userid;
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

        public String getContents() {
            return contents;
        }

        public String getTitle() {
            return title;
        }

        public String getUserid() {
            return userid;
        }

        public String getObjectId() {
            return objectId;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }
    }
}
