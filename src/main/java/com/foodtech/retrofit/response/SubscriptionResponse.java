package com.foodtech.retrofit.response;

import lombok.ToString;

import java.util.ArrayList;

@ToString
public class SubscriptionResponse {
    @ToString
    public class Groups {
        public int count;
        public ArrayList<Integer> items;
    }


    @ToString
    public class Response {
        public Users users;
        public Groups groups;
    }
@ToString
    public class Root {
        public Response response;
    }

 @ToString
    public class Users {
        public int count;
        public ArrayList<Integer> items;
    }
}