package com.foodtech.retrofit.response;

import lombok.ToString;

import java.util.List;

@ToString
public class FollowerResponse {
    public int count;
    public List<Integer> items;

@ToString
    public class Root{
    public FollowerResponse response;
}
}