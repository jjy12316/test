package com.xxxx;

import com.xxxx.controller.UserController;
import com.xxxx.po.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jndi.support.SimpleJndiBeanFactory;

public class Test {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("spring_mybatis");
        UserController userController = (UserController) factory.getBean("userController");
        User user = userController.queryUserById(20);
        System.out.println(user);
    }
}
