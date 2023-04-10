package com.test.service;

import com.test.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;
@Transactional
public interface UserLoginService {
//     登录
     Map<String,Object> Login(User user);

//     注册
     Map<String,Object> Register(User user);
}
