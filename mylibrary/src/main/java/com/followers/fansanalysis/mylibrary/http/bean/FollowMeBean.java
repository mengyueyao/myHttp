package com.followers.fansanalysis.mylibrary.http.bean;

import java.util.List;

public class FollowMeBean {


    /**
     * code : 200
     * msg : success
     * data : [{"id":1,"postId":36,"user_pk":123456789,"follower_userpk":123456789,"follower_username":"test3","follower_avatar":"http://www.baidu.com","followe_coins":8613,"creat_time":1596351774,"package_name":"com.followers.boost","platform":1}]
     */

    private int code;
    private String msg;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 1
         * postId : 36
         * user_pk : 123456789
         * follower_userpk : 123456789
         * follower_username : test3
         * follower_avatar : http://www.baidu.com
         * followe_coins : 8613
         * creat_time : 1596351774
         * package_name : com.followers.boost
         * platform : 1
         */

        private int id;
        private int postId;
        private int user_pk;
        private int follower_userpk;
        private String follower_username;
        private String follower_avatar;
        private int followe_coins;
        private int creat_time;
        private String package_name;
        private int platform;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getPostId() {
            return postId;
        }

        public void setPostId(int postId) {
            this.postId = postId;
        }

        public int getUser_pk() {
            return user_pk;
        }

        public void setUser_pk(int user_pk) {
            this.user_pk = user_pk;
        }

        public int getFollower_userpk() {
            return follower_userpk;
        }

        public void setFollower_userpk(int follower_userpk) {
            this.follower_userpk = follower_userpk;
        }

        public String getFollower_username() {
            return follower_username;
        }

        public void setFollower_username(String follower_username) {
            this.follower_username = follower_username;
        }

        public String getFollower_avatar() {
            return follower_avatar;
        }

        public void setFollower_avatar(String follower_avatar) {
            this.follower_avatar = follower_avatar;
        }

        public int getFollowe_coins() {
            return followe_coins;
        }

        public void setFollowe_coins(int followe_coins) {
            this.followe_coins = followe_coins;
        }

        public int getCreat_time() {
            return creat_time;
        }

        public void setCreat_time(int creat_time) {
            this.creat_time = creat_time;
        }

        public String getPackage_name() {
            return package_name;
        }

        public void setPackage_name(String package_name) {
            this.package_name = package_name;
        }

        public int getPlatform() {
            return platform;
        }

        public void setPlatform(int platform) {
            this.platform = platform;
        }
    }
}
