package com.foodtech.retrofit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;

public class JsonPlaceholderService {

    private Retrofit retrofit;
    private static JsonPlaceholderService instance;
    private static final String BASE_URL="https://api.vk.com";
    private JsonPlaceholderService(){

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static  JsonPlaceholderService getInstance(){
        if(instance == null){
            instance = new JsonPlaceholderService();
        }
        return instance;
    }

    public JsonPlaceholderApi getJSONApi()
    {
        return retrofit.create(JsonPlaceholderApi.class);
    }
}
