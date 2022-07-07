package com.foodtech.retrofit;
import com.foodtech.retrofit.response.UserResponse;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        final String ACCESS_TOKEN = "vk1.a.tblhXJ4g4BUKOKMMeE2GOZ8r5WZt65twyAQBlnwBGT7m2qIvacUgfgTeCX89r3t2OXFXIQi98CTO27Lr16b-ecAdIO4_-NDcUWlCctm5ma2Sk_atmvaqT1w26AVon95h6nRuuEm4y1SQPA6ei6PGzYDsUBySXtCaRXmjKonnU0rcMBMMh68YKVPgoU6P49QQ";
        final String V ="5.131";
        JsonPlaceholderApi api = JsonPlaceholderService.getInstance().getJSONApi();
        List<UserResponse> userSearch = api.userSearch(ACCESS_TOKEN, V, "Vasya Babich", 2).execute().body();
        System.out.println(userSearch.toString());
    }
}
