package com.twy.demo3;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler(new Host());
        Rent proxy = (Rent) proxyInvocationHandler.getProxy();
        proxy.rent();
    }
}
