package com.followers.fansanalysis.mylibrary.http.bean;

import java.util.List;

public class FollowMeBean {


    /**
     * code : 200
     * msg : success
     * data : [{"id":3,"postId":43,"user_pk":6060192636,"follower_userpk":37830561919,"follower_username":"m754610212","follower_avatar":"https://instagram.fbog15-1.fna.fbcdn.net/v/t51.2885-19/44884218_345707102882519_2446069589734326272_n.jpg?_nc_ht=instagram.fbog15-1.fna.fbcdn.net&_nc_ohc=TxAf-mrbVlQAX_fE8_N&oh=d2349cd836b6fb9cb39bbd643dd06330&oe=5F5ED20F&ig_cache_key=YW5vbnltb3VzX3Byb2ZpbGVfcGlj.2","followe_coins":12,"creat_time":1597287658,"package_name":"com.followers.boost","platform":1},{"id":2,"postId":40,"user_pk":6060192636,"follower_userpk":37830561919,"follower_username":"m754610212","follower_avatar":"https://instagram.fmex31-1.fna.fbcdn.net/v/t51.2885-19/44884218_345707102882519_2446069589734326272_n.jpg?_nc_ht=instagram.fmex31-1.fna.fbcdn.net&_nc_ohc=TxAf-mrbVlQAX_trem-&oh=435ff3a3869efc50ffc905f4e99d80a1&oe=5F5ED20F&ig_cache_key=YW5vbnltb3VzX3Byb2ZpbGVfcGlj.2","followe_coins":9,"creat_time":1597287466,"package_name":"com.followers.boost","platform":1}]
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
         * id : 3
         * postId : 43
         * user_pk : 6060192636
         * follower_userpk : 37830561919
         * follower_username : m754610212
         * follower_avatar : https://instagram.fbog15-1.fna.fbcdn.net/v/t51.2885-19/44884218_345707102882519_2446069589734326272_n.jpg?_nc_ht=instagram.fbog15-1.fna.fbcdn.net&_nc_ohc=TxAf-mrbVlQAX_fE8_N&oh=d2349cd836b6fb9cb39bbd643dd06330&oe=5F5ED20F&ig_cache_key=YW5vbnltb3VzX3Byb2ZpbGVfcGlj.2
         * followe_coins : 12
         * creat_time : 1597287658
         * package_name : com.followers.boost
         * platform : 1
         */

        private int id;
        private int postId;
        private long user_pk;
        private long follower_userpk;
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

        public long getUser_pk() {
            return user_pk;
        }

        public void setUser_pk(long user_pk) {
            this.user_pk = user_pk;
        }

        public long getFollower_userpk() {
            return follower_userpk;
        }

        public void setFollower_userpk(long follower_userpk) {
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
