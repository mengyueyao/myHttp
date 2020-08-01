package com.followers.fansanalysis.mylibrary.http.bean;

import java.util.List;

public class CoinsBean {


    /**
     * code : 200
     * msg : success
     * data : [{"id":1,"price":"1.99","number":300,"package_name":"com.followers.boost","google_id":"","apple_id":"","platform":1},{"id":2,"price":"1.99","number":300,"package_name":"com.followers.boost","google_id":"","apple_id":"","platform":1},{"id":3,"price":"1.99","number":300,"package_name":"com.followers.boost","google_id":"","apple_id":"","platform":1},{"id":4,"price":"1.99","number":300,"package_name":"com.followers.boost","google_id":"","apple_id":"","platform":1},{"id":5,"price":"1.99","number":300,"package_name":"com.followers.boost","google_id":"","apple_id":"","platform":1},{"id":6,"price":"1.99","number":300,"package_name":"com.followers.boost","google_id":"","apple_id":"","platform":1},{"id":7,"price":"1.99","number":300,"package_name":"com.followers.boost","google_id":"","apple_id":"","platform":1},{"id":8,"price":"1.99","number":300,"package_name":"com.followers.boost","google_id":"","apple_id":"","platform":1},{"id":9,"price":"1.99","number":300,"package_name":"com.followers.boost","google_id":"","apple_id":"","platform":1},{"id":10,"price":"1.99","number":300,"package_name":"com.followers.boost","google_id":"","apple_id":"","platform":1},{"id":11,"price":"1.99","number":300,"package_name":"com.followers.boost","google_id":"","apple_id":"","platform":1},{"id":12,"price":"1.99","number":300,"package_name":"com.followers.boost","google_id":"","apple_id":"","platform":1},{"id":13,"price":"1.99","number":300,"package_name":"com.followers.boost","google_id":"","apple_id":"","platform":1},{"id":14,"price":"1.99","number":300,"package_name":"com.followers.boost","google_id":"","apple_id":"","platform":1},{"id":15,"price":"1.99","number":300,"package_name":"com.followers.boost","google_id":"","apple_id":"","platform":1},{"id":16,"price":"1.99","number":300,"package_name":"com.followers.boost","google_id":"","apple_id":"","platform":1},{"id":17,"price":"1.99","number":300,"package_name":"com.followers.boost","google_id":"","apple_id":"","platform":1},{"id":18,"price":"1.99","number":300,"package_name":"com.followers.boost","google_id":"","apple_id":"","platform":1},{"id":19,"price":"1.99","number":300,"package_name":"com.followers.boost","google_id":"","apple_id":"","platform":1},{"id":20,"price":"1.99","number":300,"package_name":"com.followers.boost","google_id":"","apple_id":"","platform":1},{"id":21,"price":"1.99","number":300,"package_name":"com.followers.boost","google_id":"","apple_id":"","platform":1},{"id":22,"price":"1.99","number":300,"package_name":"com.followers.boost","google_id":"","apple_id":"","platform":1},{"id":23,"price":"1.99","number":300,"package_name":"com.followers.boost","google_id":"","apple_id":"","platform":1},{"id":24,"price":"1.99","number":300,"package_name":"com.followers.boost","google_id":"","apple_id":"","platform":1},{"id":25,"price":"1.99","number":300,"package_name":"com.followers.boost","google_id":"","apple_id":"","platform":1},{"id":26,"price":"1.99","number":300,"package_name":"com.followers.boost","google_id":"","apple_id":"","platform":1},{"id":27,"price":"1.99","number":300,"package_name":"com.followers.boost","google_id":"","apple_id":"","platform":1}]
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
         * price : 1.99
         * number : 300
         * package_name : com.followers.boost
         * google_id :
         * apple_id :
         * platform : 1
         */

        private int id;
        private String price;
        private int number;
        private String package_name;
        private String google_id;
        private String apple_id;
        private int platform;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getPackage_name() {
            return package_name;
        }

        public void setPackage_name(String package_name) {
            this.package_name = package_name;
        }

        public String getGoogle_id() {
            return google_id;
        }

        public void setGoogle_id(String google_id) {
            this.google_id = google_id;
        }

        public String getApple_id() {
            return apple_id;
        }

        public void setApple_id(String apple_id) {
            this.apple_id = apple_id;
        }

        public int getPlatform() {
            return platform;
        }

        public void setPlatform(int platform) {
            this.platform = platform;
        }
    }
}
