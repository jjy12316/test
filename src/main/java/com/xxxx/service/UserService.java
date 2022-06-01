package com.xxxx.service;

import com.xxxx.dao.UserDao;
import com.xxxx.po.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserDao userDao;

    public User queryUserById(Integer deptno) {
        User user = userDao.queryUserByUserId(deptno);
        return user;
    }
}
