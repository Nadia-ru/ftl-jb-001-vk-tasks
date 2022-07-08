package com.foodtech.retrofit;

import com.foodtech.retrofit.response.Item;
import lombok.val;
import lombok.var;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        final String V ="5.131";
        JsonPlaceholderApi api = JsonPlaceholderService.getInstance().getJSONApi();
        val userSearch = api.userSearch(Env.VK_ACCESS_TOKEN, V, "Vasya Babich", 20).execute().body();
        List<Item> items = userSearch.response.items;
        System.out.println(items.toString());
        List<Integer>  idItems = new ArrayList<Integer>();
        for(Item item: items){
            idItems.add(item.id);
        }
        System.out.println(idItems);

        for(Item vasya: userSearch.response.items){
            try {
                System.out.println();
                System.out.println("Follower user:"+vasya.id);
                val followerUser = api.followerUser(Env.VK_ACCESS_TOKEN, V, vasya.id).execute();
                System.out.println(followerUser.body().response.items.toString());
                System.out.println("Sub user");
                val subUser = api.subUser(Env.VK_ACCESS_TOKEN, V, vasya.id).execute();
                System.out.println(subUser.body().response.users.toString());
                System.out.println("Sub group");
                System.out.println(subUser.body().response.groups.toString());
                Thread.sleep(600);
            } catch (Exception _) {
                Thread.sleep(2000);
            }
        }
    }
}
