package com.followers.fansanalysis.mylibrary.http;


import android.text.TextUtils;

import com.followers.fansanalysis.mylibrary.http.bean.AddFollowersPostBean;
import com.followers.fansanalysis.mylibrary.http.bean.AddLikesPostBean;
import com.followers.fansanalysis.mylibrary.http.bean.CoinsBean;
import com.followers.fansanalysis.mylibrary.http.bean.ConsumeBean;
import com.followers.fansanalysis.mylibrary.http.bean.FollowMeBean;
import com.followers.fansanalysis.mylibrary.http.bean.FollowPostBean;
import com.followers.fansanalysis.mylibrary.http.bean.FollowersPostListBean;
import com.followers.fansanalysis.mylibrary.http.bean.LikeMeBean;
import com.followers.fansanalysis.mylibrary.http.bean.LikesPostListBean;
import com.followers.fansanalysis.mylibrary.http.bean.LoginBean;
import com.followers.fansanalysis.mylibrary.http.bean.TopFollowersPost;
import com.followers.fansanalysis.mylibrary.http.bean.TopLikesPostBean;
import com.followers.fansanalysis.mylibrary.http.bean.UserInfoFollowersPostListBean;
import com.followers.fansanalysis.mylibrary.http.bean.UserLikesPostBean;
import com.followers.fansanalysis.mylibrary.http.request.HttpRequest;
import com.followers.fansanalysis.mylibrary.http.request.RequestManager;
import com.followers.fansanalysis.mylibrary.util.GsonUtil;

import java.util.HashMap;
import java.util.Map;

import rx.Observable;

public class HttpUtil {

    //登录
    public static void login(String user_pk,String user_name, String cover,final HttpListener<LoginBean> listener) {

        Map<String, Object> map = new HashMap<>();
        map.put("user_pk",user_pk);
        map.put("user_name",user_name);
        map.put("avatar",cover);
        Observable observable = new HttpRequest().login(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                LoginBean loginBean= GsonUtil.format(s,LoginBean.class);

                if(null != loginBean){

                    listener.onSuccess(loginBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //获取用户信息
    public static void getUserinfo(String user_pk,final HttpListener<LoginBean> listener) {

        Map<String, Object> map = new HashMap<>();
        map.put("user_pk",user_pk);
        Observable observable = new HttpRequest().getUserinfo(map);

        new RequestManager() {
            @Override
            public void success(String s) {

                LoginBean loginBean= GsonUtil.format(s,LoginBean.class);

                if(null != loginBean){

                    listener.onSuccess(loginBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //获取金币列表
    public static void getCoins(final HttpListener<CoinsBean> listener) {

        Map<String, Object> map = new HashMap<>();
        Observable observable = new HttpRequest().getCoins(map);
        new RequestManager() {
            @Override
            public void success(String s) {

                CoinsBean coinsBean = GsonUtil.format(s,CoinsBean.class);

                if(null != coinsBean){

                    listener.onSuccess(coinsBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //消费金币
    public static void consume(String user_pk,String num,String consume_type, final HttpListener<ConsumeBean> listener) {

        Map<String, Object> map = new HashMap<>();
        map.put("user_pk",user_pk);
        map.put("consume",num);
        map.put("consume_type",consume_type);
        Observable observable = new HttpRequest().consume(map);
        new RequestManager() {
            @Override
            public void success(String s) {

                ConsumeBean consumeBean = GsonUtil.format(s,ConsumeBean.class);

                if(null != consumeBean){

                    listener.onSuccess(consumeBean);
                }
            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //获取关注帖子列表
    public static void getFollowersPostList(String user_pk,int page,boolean isTop,final HttpListener<FollowersPostListBean> listener) {

        Map<String, Object> map = new HashMap<>();
        map.put("page",page);
        if(!TextUtils.isEmpty(user_pk)){
            map.put("user_pk",user_pk);
        }
        if(isTop){
            map.put("isTop",1);
        }else{
            map.put("isTop",2);
        }
        Observable observable = new HttpRequest().getFollowersPostList(map);
        new RequestManager() {
            @Override
            public void success(String s) {

                FollowersPostListBean followersPostListBean = GsonUtil.format(s,FollowersPostListBean.class);

                if(null != followersPostListBean){

                    listener.onSuccess(followersPostListBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //添加关注帖子列表
    public static void addFollowersPost(String user_pk,String desc,boolean isTop,final HttpListener<AddFollowersPostBean> listener) {

        Map<String, Object> map = new HashMap<>();
        map.put("desc",desc);
        if(isTop){
            map.put("isTop",1);
        }else{
            map.put("isTop",2);
        }
        map.put("user_pk",user_pk);
        Observable observable = new HttpRequest().addFollowersPost(map);
        new RequestManager() {
            @Override
            public void success(String s) {

                AddFollowersPostBean addFollowersPostBean = GsonUtil.format(s,AddFollowersPostBean.class);

                if(null != addFollowersPostBean){

                    listener.onSuccess(addFollowersPostBean);
                }
            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }

    //获取点赞帖子列表
    public static void getLikesPostList(String user_pk,int page,boolean isTop,final HttpListener<LikesPostListBean> listener) {
        Map<String, Object> map = new HashMap<>();
        map.put("page",page);
        if(!TextUtils.isEmpty(user_pk)){

            map.put("user_pk",user_pk);
        }

        if(isTop){
            map.put("isTop",1);
        }else{
            map.put("isTop",2);
        }
        Observable observable = new HttpRequest().getLikesPostList(map);
        new RequestManager() {
            @Override
            public void success(String s) {

                LikesPostListBean likesPostListBean = GsonUtil.format(s,LikesPostListBean.class);

                if(null != likesPostListBean){

                    listener.onSuccess(likesPostListBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }

    //添加点赞帖子
    public static void addLikesPost(String user_pk,String desc,String image,boolean isTop,final HttpListener<AddLikesPostBean> listener) {
        Map<String, Object> map = new HashMap<>();
        map.put("user_pk",user_pk);
        map.put("desc",desc);
        map.put("image",image);
        if(isTop){
            map.put("isTop",1);

        }else{

            map.put("isTop",2);
        }

        Observable observable = new HttpRequest().addLikesPost(map);
        new RequestManager() {
            @Override
            public void success(String s) {

                AddLikesPostBean addLikesPostBean = GsonUtil.format(s,AddLikesPostBean.class);

                if(null != addLikesPostBean){

                    listener.onSuccess(addLikesPostBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }

    //获取用户发布的关注帖子列表
    public static void getUserFollowersPostList(String user_pk,int page,final HttpListener<UserInfoFollowersPostListBean> listener) {

        Map<String, Object> map = new HashMap<>();
        map.put("user_pk",user_pk);
        map.put("page",page);
        Observable observable = new HttpRequest().getUserFollowersPostList(map);
        new RequestManager() {
            @Override
            public void success(String s) {

                UserInfoFollowersPostListBean userInfoFollowersPostListBean = GsonUtil.format(s,UserInfoFollowersPostListBean.class);

                if(null != userInfoFollowersPostListBean){

                    listener.onSuccess(userInfoFollowersPostListBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }

    //获取用户发布的点赞帖子列表
    public static void getUserLikesPostsList(final String user_pk, int page, final HttpListener<UserLikesPostBean> listener) {

        Map<String, Object> map = new HashMap<>();
        map.put("user_pk",user_pk);
        map.put("page",page);
        Observable observable = new HttpRequest().getUserLikesPostsList(map);
        new RequestManager() {
            @Override
            public void success(String s) {

                UserLikesPostBean userLikesPostBean = GsonUtil.format(s,UserLikesPostBean.class);

                if(null != userLikesPostBean){

                    listener.onSuccess(userLikesPostBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }

    //置顶关注帖子
    public static void topFollowersPost(String user_pk,int post_id,final HttpListener<TopFollowersPost> listener) {

        Map<String, Object> map = new HashMap<>();
        map.put("post_id",post_id);
        map.put("user_pk",user_pk);
        Observable observable = new HttpRequest().topFollowersPost(map);
        new RequestManager() {
            @Override
            public void success(String s) {

                TopFollowersPost topFollowersPost = GsonUtil.format(s,TopFollowersPost.class);

                if(null != topFollowersPost){

                    listener.onSuccess(topFollowersPost);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }

    //置顶点赞帖子
    public static void topLikesPost(String user_pk,int post_id,final HttpListener<TopLikesPostBean> listener) {

        Map<String, Object> map = new HashMap<>();
        map.put("post_id",post_id);
        map.put("user_pk",user_pk);
        Observable observable = new HttpRequest().topLikesPost(map);
        new RequestManager() {
            @Override
            public void success(String s) {

                TopLikesPostBean topLikesPostBean = GsonUtil.format(s,TopLikesPostBean.class);

                if(null != topLikesPostBean){

                    listener.onSuccess(topLikesPostBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }

    //关注帖子
    public static void followPost(String user_pk,int post_id,final HttpListener<FollowPostBean> listener) {

        Map<String, Object> map = new HashMap<>();
        map.put("post_id",post_id);
        map.put("user_pk",user_pk);
        Observable observable = new HttpRequest().followPost(map);
        new RequestManager() {
            @Override
            public void success(String s) {

                FollowPostBean followPostBean=GsonUtil.format(s,FollowPostBean.class);

                if(null != followPostBean){

                    listener.onSuccess(followPostBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //点赞帖子
    public static void likePost(String user_pk,int post_id,final HttpListener<FollowPostBean> listener) {

        Map<String, Object> map = new HashMap<>();
        map.put("post_id",post_id);
        map.put("user_pk",user_pk);
        Observable observable = new HttpRequest().likePost(map);
        new RequestManager() {
            @Override
            public void success(String s) {

                FollowPostBean followPostBean=GsonUtil.format(s,FollowPostBean.class);

                if(null != followPostBean){

                    listener.onSuccess(followPostBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //赞过我的人
    public static void likeMe(String user_pk,final HttpListener<LikeMeBean> listener) {

        Map<String, Object> map = new HashMap<>();
        map.put("user_pk",user_pk);
        Observable observable = new HttpRequest().likeMe(map);
        new RequestManager() {
            @Override
            public void success(String s) {

                LikeMeBean likeMeBean = GsonUtil.format(s,LikeMeBean.class);

                if(null != likeMeBean){

                    listener.onSuccess(likeMeBean);
                }

            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }


    //关注过我的
    public static void followMe(String user_pk,final HttpListener<FollowMeBean> listener) {

        Map<String, Object> map = new HashMap<>();
        map.put("user_pk",user_pk);
        Observable observable = new HttpRequest().followMe(map);
        new RequestManager() {
            @Override
            public void success(String s) {

                FollowMeBean followMeBean = GsonUtil.format(s,FollowMeBean.class);

                if(null != followMeBean){

                    listener.onSuccess(followMeBean);
                }


            }

            @Override
            public void failure(String e) {

                listener.onError(e);
            }

        }.post(observable);
    }

}

