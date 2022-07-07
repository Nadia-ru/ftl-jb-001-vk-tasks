package com.foodtech.retrofit.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserResponse {
    private int id;
    private String track_code;
    private String first_name;
    private String last_name;
    private boolean can_access_closed;
    private boolean is_closed;
}
