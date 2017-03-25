package com.tangcco.interview.bean;

import java.util.List;

/**
 * Created by YN on 2017/3/13.
 */

public class collect {

    /**
     * results : [{"createdAt":"2017-03-13 13:42:59","exerciseid":"\tBxUg1115","userid":"\tuj13gggk","objectId":"brmCBBBV","updatedAt":"2017-03-13 13:43:11"}]
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
         * createdAt : 2017-03-13 13:42:59
         * exerciseid : 	BxUg1115
         * userid : 	uj13gggk
         * objectId : brmCBBBV
         * updatedAt : 2017-03-13 13:43:11
         */
        private String createdAt;
        private String exerciseid;
        private String userid;
        private String objectId;
        private String updatedAt;

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public void setExerciseid(String exerciseid) {
            this.exerciseid = exerciseid;
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

        public String getExerciseid() {
            return exerciseid;
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
