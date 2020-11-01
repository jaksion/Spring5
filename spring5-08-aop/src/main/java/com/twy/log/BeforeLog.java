package com.twy.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 前置log
 */
//方法执行前增强实现MethodBoforeAdvice接口
public class BeforeLog implements MethodBeforeAdvice {

    /**
     *
     * @param method  要执行目标对象的方法
     * @param args 参数
     * @param target 目标对象
     * @throws Throwable
     */
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(method.getName() + "要被执行啦！！！");
    }
}
