package com.foodtech.retrofit.response;

import lombok.ToString;

import java.util.ArrayList;

@ToString
public class Item {
    public int id;
    public String track_code;
    public String first_name;
    public String last_name;
    public boolean can_access_closed;
    public boolean is_closed;

    @ToString
    public class Response {
        public int count;
        public ArrayList<Item> items;
    }

    @ToString
    public class Root {
        public Response response;
    }
}