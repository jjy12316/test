package com.xxxx.controller;

import com.xxxx.po.User;
import com.xxxx.service.UserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    public User queryUserById(Integer deptno){
        return userService.queryUserById(deptno);
    }
}
