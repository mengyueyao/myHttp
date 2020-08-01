package com.followers.fansanalysis.mylibrary.http.bean;

import java.util.List;

public class FollowersPostListBean {


    /**
     * code : 200
     * msg : success
     * data : [{"id":36,"userId_id":123456789,"describe":"test123456","username":"test3","avatar":"http://www.baidu.com","creat_time":1595812862,"isTop":2,"top_time":1595812862,"is_follower":2,"package_name":"com.follower.boost","platform":1},{"id":35,"userId_id":123456789,"describe":"18","username":"test3","avatar":"http://www.baidu.com","creat_time":1594775805,"isTop":2,"top_time":1594775805,"is_follower":2,"package_name":"com.followers.boost","platform":1},{"id":34,"userId_id":123456789,"describe":"17","username":"test3","avatar":"http://www.baidu.com","creat_time":1594728684,"isTop":2,"top_time":1594728684,"is_follower":2,"package_name":"com.followers.boost","platform":1},{"id":33,"userId_id":123456789,"describe":"17","username":"test3","avatar":"http://www.baidu.com","creat_time":1594728655,"isTop":2,"top_time":1594728655,"is_follower":2,"package_name":"com.followers.boost","platform":1},{"id":32,"userId_id":123456789,"describe":"17","username":"test3","avatar":"http://www.baidu.com","creat_time":1594728596,"isTop":2,"top_time":1594728596,"is_follower":2,"package_name":"com.followers.boost","platform":1},{"id":31,"userId_id":123456789,"describe":"17","username":"test3","avatar":"http://www.baidu.com","creat_time":1594728561,"isTop":2,"top_time":1594728561,"is_follower":2,"package_name":"com.followers.boost","platform":1},{"id":30,"userId_id":123456789,"describe":"17","username":"test3","avatar":"http://www.baidu.com","creat_time":1594728479,"isTop":2,"top_time":1594728479,"is_follower":2,"package_name":"com.followers.boost","platform":1},{"id":29,"userId_id":123456789,"describe":"17","username":"test3","avatar":"http://www.baidu.com","creat_time":1594728452,"isTop":2,"top_time":1594728452,"is_follower":2,"package_name":"com.followers.boost","platform":1},{"id":28,"userId_id":123456789,"describe":"17","username":"test3","avatar":"http://www.baidu.com","creat_time":1594727881,"isTop":2,"top_time":1594727881,"is_follower":2,"package_name":"com.followers.boost","platform":1},{"id":27,"userId_id":123456789,"describe":"17","username":"test3","avatar":"http://www.baidu.com","creat_time":1594727837,"isTop":2,"top_time":1594727837,"is_follower":2,"package_name":"com.followers.boost","platform":1},{"id":26,"userId_id":123456789,"describe":"16","username":"test3","avatar":"http://www.baidu.com","creat_time":1594727412,"isTop":2,"top_time":1594727412,"is_follower":2,"package_name":"com.followers.boost","platform":1},{"id":25,"userId_id":123456789,"describe":"15","username":"test3","avatar":"http://www.baidu.com","creat_time":1594720766,"isTop":2,"top_time":1594720766,"is_follower":2,"package_name":"com.followers.boost","platform":1},{"id":24,"userId_id":123456789,"describe":"15","username":"test3","avatar":"http://www.baidu.com","creat_time":1594720748,"isTop":2,"top_time":1594720748,"is_follower":2,"package_name":"com.followers.boost","platform":1},{"id":23,"userId_id":123456789,"describe":"15","username":"test3","avatar":"http://www.baidu.com","creat_time":1594720644,"isTop":2,"top_time":1594720644,"is_follower":2,"package_name":"com.followers.boost","platform":1},{"id":22,"userId_id":123456789,"describe":"15","username":"test3","avatar":"http://www.baidu.com","creat_time":1594720411,"isTop":2,"top_time":1594720411,"is_follower":2,"package_name":"com.followers.boost","platform":1},{"id":21,"userId_id":123456789,"describe":"15","username":"test3","avatar":"http://www.baidu.com","creat_time":1594720382,"isTop":2,"top_time":1594720382,"is_follower":2,"package_name":"com.followers.boost","platform":1},{"id":20,"userId_id":123456789,"describe":"15","username":"test3","avatar":"http://www.baidu.com","creat_time":1594720275,"isTop":2,"top_time":1594720275,"is_follower":2,"package_name":"com.followers.boost","platform":1},{"id":19,"userId_id":123456789,"describe":"15","username":"test3","avatar":"http://www.baidu.com","creat_time":1594720223,"isTop":2,"top_time":1594720223,"is_follower":2,"package_name":"com.followers.boost","platform":1},{"id":18,"userId_id":123456789,"describe":"15","username":"test3","avatar":"http://www.baidu.com","creat_time":1594720010,"isTop":2,"top_time":1594720010,"is_follower":2,"package_name":"com.followers.boost","platform":1},{"id":17,"userId_id":123456789,"describe":"14","username":"test3","avatar":"http://www.baidu.com","creat_time":1594719883,"isTop":2,"top_time":1594719883,"is_follower":2,"package_name":"com.followers.boost","platform":1}]
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
         * id : 36
         * userId_id : 123456789
         * describe : test123456
         * username : test3
         * avatar : http://www.baidu.com
         * creat_time : 1595812862
         * isTop : 2
         * top_time : 1595812862
         * is_follower : 2
         * package_name : com.follower.boost
         * platform : 1
         */

        private int id;
        private String userId_id;
        private String describe;
        private String username;
        private String avatar;
        private int creat_time;
        private int isTop;
        private int top_time;
        private int is_follower;
        private String package_name;
        private int platform;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUserId_id() {
            return userId_id;
        }

        public void setUserId_id(String userId_id) {
            this.userId_id = userId_id;
        }

        public String getDescribe() {
            return describe;
        }

        public void setDescribe(String describe) {
            this.describe = describe;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public int getCreat_time() {
            return creat_time;
        }

        public void setCreat_time(int creat_time) {
            this.creat_time = creat_time;
        }

        public int getIsTop() {
            return isTop;
        }

        public void setIsTop(int isTop) {
            this.isTop = isTop;
        }

        public int getTop_time() {
            return top_time;
        }

        public void setTop_time(int top_time) {
            this.top_time = top_time;
        }

        public int getIs_follower() {
            return is_follower;
        }

        public void setIs_follower(int is_follower) {
            this.is_follower = is_follower;
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
