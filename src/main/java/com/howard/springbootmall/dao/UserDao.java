package com.howard.springbootmall.dao;

import com.howard.springbootmall.dto.UserRegisterRequest;
import com.howard.springbootmall.model.User;

public interface UserDao {
    Integer createUser(UserRegisterRequest userRegisterRequest);
    User getUserById(Integer userId);
    User getUserByEmail(String email);
}
