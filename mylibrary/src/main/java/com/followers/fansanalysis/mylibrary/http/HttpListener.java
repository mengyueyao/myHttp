package com.followers.fansanalysis.mylibrary.http;

public interface HttpListener<T> {

    void onSuccess(T bean);

    void onError(String error);
}
