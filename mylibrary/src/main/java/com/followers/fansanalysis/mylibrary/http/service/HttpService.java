package com.followers.fansanalysis.mylibrary.http.service;

import com.google.gson.JsonElement;

import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by meng on 2017/10/10.
 */

public interface HttpService {

    //登录
    @POST("login")
    Observable<JsonElement> login(@Body Map<String, Object> map);

    //获取用户信息
    @POST("get_userinfo")
    Observable<JsonElement> getUserinfo(@Body Map<String, Object> map);

    //获取金币列表
    @POST("get_coins")
    Observable<JsonElement> getCoins(@Body Map<String, Object> map);

    //消费金币
    @POST("consume")
    Observable<JsonElement> consume(@Body Map<String, Object> map);

    //获取关注帖子
    @POST("get_followerspost_list")
    Observable<JsonElement> getFollowersPostList(@Body Map<String, Object> map);

    //添加关注帖子
    @POST("add_followersposts")
    Observable<JsonElement> addFollowersPost(@Body Map<String, Object> map);

    //获取点赞帖子
    @POST("get_likes_post_list")
    Observable<JsonElement> getLikesPostList(@Body Map<String, Object> map);

    //添加点赞帖子
    @POST("add_likes_posts")
    Observable<JsonElement> addLikesPost(@Body Map<String, Object> map);

    //获取用户发布的关注帖子列表
    @POST("get_user_followers_post_list")
    Observable<JsonElement> getUserFollowersPostList(@Body Map<String, Object> map);

    //获取用户发布的点赞的帖子列表
    @POST("get_user_likes_posts_list")
    Observable<JsonElement> getUserLikesPostsList(@Body Map<String, Object> map);

    //置顶关注帖子
    @POST("top_followers_post")
    Observable<JsonElement> topFollowersPost(@Body Map<String, Object> map);

    //置顶点赞帖子
    @POST("top_likes_post")
    Observable<JsonElement> topLikesPost(@Body Map<String, Object> map);

    //关注帖子
    @POST("follow_post")
    Observable<JsonElement> followPost(@Body Map<String, Object> map);

    //点赞帖子帖子
    @POST("like_post")
    Observable<JsonElement> likePost(@Body Map<String, Object> map);

    //赞过我的人
    @POST("like_me")
    Observable<JsonElement> likeMe(@Body Map<String, Object> map);

    //关注过我的人
    @POST("follow_me")
    Observable<JsonElement> followMe(@Body Map<String, Object> map);

    //google支付回调
    @POST("googlpay_callback")
    Observable<JsonElement> googlpay_callback(@Body Map<String, Object> map);





}
