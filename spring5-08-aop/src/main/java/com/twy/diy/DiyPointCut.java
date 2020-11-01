package com.twy.diy;

/**
 * 自定义类切入点
 */
public class DiyPointCut {

    public void before(){
        System.out.println("自定义类DiyPointCut的before方法，在调用方法前调用！！！");
    }

    public void after(){
        System.out.println("自定义类DiyPointCut的after方法，在调用方法后调用！！！");
    }
}
