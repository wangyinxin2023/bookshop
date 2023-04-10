package com.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private Integer userId;

    private String userName;

    private String userPwd;

    private Integer userType;


}