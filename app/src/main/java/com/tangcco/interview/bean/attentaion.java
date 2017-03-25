package com.tangcco.interview.bean;

import java.util.List;

/**
 * Created by YN on 2017/3/13.
 */

public class attentaion {


    /**
     * results : [{"createdAt":"2017-03-13 13:46:12","startUserid":"\tyHoD777b","userid":"\tuj13gggk","objectId":"iJhBEEEG","updatedAt":"2017-03-13 13:46:49","username":"admin"}]
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
         * createdAt : 2017-03-13 13:46:12
         * startUserid : 	yHoD777b
         * userid : 	uj13gggk
         * objectId : iJhBEEEG
         * updatedAt : 2017-03-13 13:46:49
         * username : admin
         */
        private String createdAt;
        private String startUserid;
        private String userid;
        private String objectId;
        private String updatedAt;
        private String username;

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public void setStartUserid(String startUserid) {
            this.startUserid = startUserid;
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

        public void setUsername(String username) {
            this.username = username;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public String getStartUserid() {
            return startUserid;
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

        public String getUsername() {
            return username;
        }
    }
}
