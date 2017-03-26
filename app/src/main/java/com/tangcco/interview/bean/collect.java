package com.tangcco.interview.bean;

import cn.bmob.v3.BmobObject;

/**
 * Created by YN on 2017/3/13.
 */

public class collect extends BmobObject {

        /**
         * createdAt : 2017-03-13 13:42:59
         * exerciseid : 	BxUg1115
         * userid : 	uj13gggk
         * objectId : brmCBBBV
         * updatedAt : 2017-03-13 13:43:11
         */
        private String  questionName;
        private String exerciseid;
        private String userid;

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public void setExerciseid(String exerciseid) {
            this.exerciseid = exerciseid;
        }
        public void setUserid(String userid) {
            this.userid = userid;
        }
        public String getExerciseid() {
            return exerciseid;
        }
        public String getUserid() {
            return userid;
        }


}
