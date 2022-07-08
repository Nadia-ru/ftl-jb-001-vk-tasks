package com.foodtech.retrofit;

import lombok.val;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        final String V ="5.131";
        JsonPlaceholderApi api = JsonPlaceholderService.getInstance().getJSONApi();
        val userSearch = api.userSearch(Env.VK_ACCESS_TOKEN, V, "Vasya Babich", 2).execute();
        System.out.println(userSearch.toString());
        System.out.println(userSearch.body().response.items);
    }
}
