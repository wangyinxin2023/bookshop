package com.test.mapper;

import com.test.model.User;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User Login(User user);
}