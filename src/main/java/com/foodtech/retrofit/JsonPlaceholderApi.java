package com.foodtech.retrofit;

import com.foodtech.retrofit.response.FollowerResponse;
import com.foodtech.retrofit.response.Item;

import com.foodtech.retrofit.response.SubscriptionResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface JsonPlaceholderApi {

    @GET("/method/users.search")
    Call<Item.Root> userSearch(
            @Query("access_token") String access,
            @Query("v") String version,
            @Query("q") String name,
            @Query("count") Integer count
    );

    @GET("/method/users.getFollowers")
    Call<FollowerResponse.Root> followerUser(
            @Query("access_token") String access,
            @Query("v") String version,
            @Query("user_id") Integer userId
    );

    @GET("/method/users.getSubscriptions")
    Call<SubscriptionResponse.Root> subUser(
            @Query("access_token") String access,
            @Query("v") String version,
            @Query("user_id") Integer userId
    );
}
