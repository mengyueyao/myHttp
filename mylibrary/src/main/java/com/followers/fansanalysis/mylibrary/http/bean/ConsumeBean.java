package com.followers.fansanalysis.mylibrary.http.bean;

public class ConsumeBean {


    /**
     * code : 200
     * msg : success
     * data : {"id":17,"userId_id":123456789,"consume_type":"testConsume","ordernum":"fcaf1f21-50f9-4ce8-8854-2470ce1fdfe4","buy_time":1596265019,"coins":10,"platform":1}
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
         * id : 17
         * userId_id : 123456789
         * consume_type : testConsume
         * ordernum : fcaf1f21-50f9-4ce8-8854-2470ce1fdfe4
         * buy_time : 1596265019
         * coins : 10
         * platform : 1
         */

        private int id;
        private String userId_id;
        private String consume_type;
        private String ordernum;
        private int buy_time;
        private int coins;
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

        public String getConsume_type() {
            return consume_type;
        }

        public void setConsume_type(String consume_type) {
            this.consume_type = consume_type;
        }

        public String getOrdernum() {
            return ordernum;
        }

        public void setOrdernum(String ordernum) {
            this.ordernum = ordernum;
        }

        public int getBuy_time() {
            return buy_time;
        }

        public void setBuy_time(int buy_time) {
            this.buy_time = buy_time;
        }

        public int getCoins() {
            return coins;
        }

        public void setCoins(int coins) {
            this.coins = coins;
        }

        public int getPlatform() {
            return platform;
        }

        public void setPlatform(int platform) {
            this.platform = platform;
        }
    }
}
