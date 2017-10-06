package com.chepesko.bob.dirble_v4;

import android.app.Application;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by bob on 03.10.2017.
 */

public class Controller extends Application {
    static final String BASE_URL="http://api.dirble.com/v2/";

    private static Api api;

    public static Api getApi(){

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api =retrofit.create(Api.class);
        return api;
    }
}
