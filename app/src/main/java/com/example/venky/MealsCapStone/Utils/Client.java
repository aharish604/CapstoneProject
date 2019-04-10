package com.example.venky.MealsCapStone.Utils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by VENKY on 08/04/2019.
 */

public class Client {
    public static Retrofit getClient(){

        return new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}

