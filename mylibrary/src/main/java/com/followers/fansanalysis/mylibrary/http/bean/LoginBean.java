package com.followers.fansanalysis.mylibrary.http.bean;

public class LoginBean {


    /**
     * code : 200
     * msg : success
     * data : {"user_name":"test2","user_pk":1234567,"avatar":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1595688485965&di=5a77dc4683c4f3886adada069fcf3604&imgtype=0&src=http%3A%2F%2Fa3.att.hudong.com%2F14%2F75%2F01300000164186121366756803686.jpg","package_name":"com.follower.boost","platform":1,"balance_coins":0,"total_coins":0,"use_coins":0,"money":"0","vip_end":"","vip_id":"","country":"127.0.0.1","creat_time":1595690437,"status":0}
     */

    private int code;
    private String msg;
    private DataBean data;

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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * user_name : test2
         * user_pk : 1234567
         * avatar : https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1595688485965&di=5a77dc4683c4f3886adada069fcf3604&imgtype=0&src=http%3A%2F%2Fa3.att.hudong.com%2F14%2F75%2F01300000164186121366756803686.jpg
         * package_name : com.follower.boost
         * platform : 1
         * balance_coins : 0
         * total_coins : 0
         * use_coins : 0
         * money : 0
         * vip_end :
         * vip_id :
         * country : 127.0.0.1
         * creat_time : 1595690437
         * status : 0
         */

        private String user_name;
        private long user_pk;
        private String avatar;
        private String package_name;
        private int platform;
        private int balance_coins;
        private int total_coins;
        private int use_coins;
        private String money;
        private String vip_end;
        private String vip_id;
        private String country;
        private int creat_time;
        private int status;

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public long getUser_pk() {
            return user_pk;
        }

        public void setUser_pk(long user_pk) {
            this.user_pk = user_pk;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
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

        public int getBalance_coins() {
            return balance_coins;
        }

        public void setBalance_coins(int balance_coins) {
            this.balance_coins = balance_coins;
        }

        public int getTotal_coins() {
            return total_coins;
        }

        public void setTotal_coins(int total_coins) {
            this.total_coins = total_coins;
        }

        public int getUse_coins() {
            return use_coins;
        }

        public void setUse_coins(int use_coins) {
            this.use_coins = use_coins;
        }

        public String getMoney() {
            return money;
        }

        public void setMoney(String money) {
            this.money = money;
        }

        public String getVip_end() {
            return vip_end;
        }

        public void setVip_end(String vip_end) {
            this.vip_end = vip_end;
        }

        public String getVip_id() {
            return vip_id;
        }

        public void setVip_id(String vip_id) {
            this.vip_id = vip_id;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public int getCreat_time() {
            return creat_time;
        }

        public void setCreat_time(int creat_time) {
            this.creat_time = creat_time;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }
    }
}
