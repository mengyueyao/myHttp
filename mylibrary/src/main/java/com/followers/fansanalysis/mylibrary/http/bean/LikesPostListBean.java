package com.followers.fansanalysis.mylibrary.http.bean;

import java.util.List;

public class LikesPostListBean {


    /**
     * code : 200
     * msg : success
     * data : [{"id":3,"userId_id":6060192636,"postId":"2342235611186642568_6060192636","describe":"like","image":"","creat_time":1597297684,"isTop":1,"top_time":1597297684,"is_like":2,"package_name":"com.followers.boost","platform":1},{"id":2,"userId_id":6060192636,"postId":"2342235611186642568_6060192636","describe":"like","image":"","creat_time":1597297683,"isTop":1,"top_time":1597297683,"is_like":2,"package_name":"com.followers.boost","platform":1}]
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
         * userId_id : 6060192636
         * postId : 2342235611186642568_6060192636
         * describe : like
         * image :
         * creat_time : 1597297684
         * isTop : 1
         * top_time : 1597297684
         * is_like : 2
         * package_name : com.followers.boost
         * platform : 1
         */

        private int id;
        private long userId_id;
        private String postId;
        private String describe;
        private String image;
        private int creat_time;
        private int isTop;
        private int top_time;
        private int is_like;
        private String package_name;
        private int platform;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public long getUserId_id() {
            return userId_id;
        }

        public void setUserId_id(long userId_id) {
            this.userId_id = userId_id;
        }

        public String getPostId() {
            return postId;
        }

        public void setPostId(String postId) {
            this.postId = postId;
        }

        public String getDescribe() {
            return describe;
        }

        public void setDescribe(String describe) {
            this.describe = describe;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
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

        public int getIs_like() {
            return is_like;
        }

        public void setIs_like(int is_like) {
            this.is_like = is_like;
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
