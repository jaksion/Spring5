package com.twy.demo1;
//静态代理
public class SimpleProxy implements Rent{

    private Host host;

    public SimpleProxy(Host host){
        this.host = host;
    }

    public void rent() {
        System.out.println("中介来啦");
        seeHouse();
        host.rent();
    }

    //代理可以做的其它事情
    public void seeHouse(){
        System.out.println("房东带你看房！！");
    }
}
