package com.twy.demo1;
//客户
public class Client {
    public static void main(String[] args) {
        SimpleProxy simpleProxy = new SimpleProxy(new Host());
        simpleProxy.rent();
    }
}
