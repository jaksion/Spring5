package com.twy.demo4;

import com.twy.demo2.UserDao;
import com.twy.demo2.UserService;

public class Client {
    public static void main(String[] args) {
        UserService userService = new UserService();
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler(userService);
        UserDao proxy = (UserDao) proxyInvocationHandler.getProxy();
        proxy.add();
    }
}
