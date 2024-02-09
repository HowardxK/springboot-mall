package com.howard.springbootmall.service;

import com.howard.springbootmall.dto.UserLoginRequest;
import com.howard.springbootmall.dto.UserRegisterRequest;
import com.howard.springbootmall.model.User;

public interface UserService {
    Integer register(UserRegisterRequest userRegisterRequest);
    User getUserById(Integer userId);
    User login(UserLoginRequest userLoginRequest);
}
