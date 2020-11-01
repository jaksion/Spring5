package com.twy.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * 实现AfterReturningAdvice接口，实现后置通知
 */
public class AfterLog implements AfterReturningAdvice {

    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {

        System.out.println("执行了"+method.getName()+"方法！！！！");
    }
}
