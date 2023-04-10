package com.test.service.impl;

import com.test.mapper.UserMapper;
import com.test.model.User;
import com.test.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class UserLoginServiceImpl implements UserLoginService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public Map<String, Object> Login(User user) {
        Map<String,Object> userList=new HashMap<>();
        int code=200;
        String msg="登录成功";
        User u = userMapper.Login(user);
        if (u==null){
            code=404;
            msg="账号不存在";
        }else {
            if (!u.getUserPwd().equals(user.getUserPwd())){
                code=403;
                msg="密码错误";
            }else {
                userList.put("obj",u);
            }
        }
        userList.put("code",code);
        userList.put("msg",msg);
        return userList;
    }

    @Override
    public Map<String, Object> Register(User user) {
        Map<String,Object> map = new HashMap<>();
        int code=200;
        String msg="新添成功";
        int i = userMapper.insertSelective(user);
        if (i<=0){
            code=4042;
            msg="新添失败";
        }
        map.put("code",code);
        map.put("msg",msg);
        return map;
    }
}
