package com.followers.fansanalysis.mylibrary.http.request;


import com.followers.fansanalysis.mylibrary.http.ObjectLoader;
import com.followers.fansanalysis.mylibrary.http.RetrofitServiceManager;
import com.followers.fansanalysis.mylibrary.http.service.HttpService;
import com.google.gson.JsonElement;

import java.util.Map;

import rx.Observable;
import rx.functions.Func1;

/**
 * Created by meng on 2017/10/10.
 */

public class HttpRequest extends ObjectLoader {

    private HttpService httpService;

    public HttpRequest() {

        httpService = RetrofitServiceManager.getInstance().create(HttpService.class);
    }

    /**
     *
     * 用户登录
     * @return
     */

    public Observable<JsonElement> login(Map<String,Object> map){

        return observable(httpService.login(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }


    /**
     *
     * 获取用户信息
     * @return
     */

    public Observable<JsonElement> getUserinfo(Map<String,Object> map){

        return observable(httpService.getUserinfo(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }


    /**
     *
     * 获取金币列表
     * @return
     */

    public Observable<JsonElement> getCoins(Map<String,Object> map){

        return observable(httpService.getCoins(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }


    /**
     *
     * 消费金币
     * @return
     */

    public Observable<JsonElement> consume(Map<String,Object> map){

        return observable(httpService.consume(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }

    /**
     *
     * 获取关注帖子列表
     * @return
     */

    public Observable<JsonElement> getFollowersPostList(Map<String,Object> map){

        return observable(httpService.getFollowersPostList(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }


    /**
     *
     * 添加关注帖子
     * @return
     */

    public Observable<JsonElement> addFollowersPost(Map<String,Object> map){

        return observable(httpService.addFollowersPost(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }

    /**
     *
     * 获取点赞帖子列表
     * @return
     */

    public Observable<JsonElement> getLikesPostList(Map<String,Object> map){

        return observable(httpService.getLikesPostList(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }

    /**
     *
     * 添加点赞帖子列表
     * @return
     */

    public Observable<JsonElement> addLikesPost(Map<String,Object> map){

        return observable(httpService.addLikesPost(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }

    /**
     *
     * 获取用户发布的关注帖子列表
     * @return
     */

    public Observable<JsonElement> getUserFollowersPostList(Map<String,Object> map){

        return observable(httpService.getUserFollowersPostList(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }

    /**
     *
     * 获取用户发布的点赞帖子列表
     * @return
     */

    public Observable<JsonElement> getUserLikesPostsList(Map<String,Object> map){

        return observable(httpService.getUserLikesPostsList(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }


    /**
     *
     * 置顶关注帖子
     * @return
     */

    public Observable<JsonElement> topFollowersPost(Map<String,Object> map){

        return observable(httpService.topFollowersPost(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }


    /**
     *
     * 置顶点赞帖子
     * @return
     */

    public Observable<JsonElement> topLikesPost(Map<String,Object> map){

        return observable(httpService.topLikesPost(map)).map(new Func1<JsonElement,JsonElement>() {
            @Override
            public JsonElement call(JsonElement s) {


                return s;
            }
        });
    }

}
