package com.tangcco.interview.bean;

import java.util.List;

/**
 * Created by YN on 2017/3/13.
 */

public class photos {

    /**
     * results : [{"createdAt":"2017-03-13 13:43:51","path":"http://img22.mtime.cn/up/2010/08/18/085549.33812486_o.jpg","postid":"\tQajGOOO3","objectId":"AF7bUUUX","updatedAt":"2017-03-13 13:44:57"}]
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
         * createdAt : 2017-03-13 13:43:51
         * path : http://img22.mtime.cn/up/2010/08/18/085549.33812486_o.jpg
         * postid : 	QajGOOO3
         * objectId : AF7bUUUX
         * updatedAt : 2017-03-13 13:44:57
         */
        private String createdAt;
        private String path;
        private String postid;
        private String objectId;
        private String updatedAt;

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public void setPostid(String postid) {
            this.postid = postid;
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

        public String getPath() {
            return path;
        }

        public String getPostid() {
            return postid;
        }

        public String getObjectId() {
            return objectId;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }
    }
}
