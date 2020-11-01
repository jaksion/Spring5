package com.twy.demo2;

public class Client {
    public static void main(String[] args) {
        UserServiceProxy userServiceProxy = new UserServiceProxy(new UserService());
        userServiceProxy.add();
    }
}
