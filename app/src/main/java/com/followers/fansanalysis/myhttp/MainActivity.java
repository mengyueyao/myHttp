package com.followers.fansanalysis.myhttp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.followers.fansanalysis.mylibrary.http.Utils;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Utils.setContext(this);

        Utils.setBaseUrl("http://127.0.0.1:8000/");

        Utils.setDebug(true);

    }




}
