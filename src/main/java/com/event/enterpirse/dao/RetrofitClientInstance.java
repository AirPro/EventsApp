package com.event.enterpirse.dao;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {

    // Singleton Design Pattern
    private static Retrofit retrofit;
    private static String BASE_URL = ("C:\\JsonFiles"); //Insert domain name prefix of .json feed

    public static Retrofit getRetrofitInstance() {
        if ( retrofit == null ) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
