package com.foodtech.retrofit;

import com.foodtech.retrofit.response.UserResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface JsonPlaceholderApi {

    @GET("/method/users.search")
    Call<List<UserResponse>> userSearch(@Query("access_token") String access,
                                        @Query("v") String version,@Query("q") String name,@Query("count") Integer count);
}
