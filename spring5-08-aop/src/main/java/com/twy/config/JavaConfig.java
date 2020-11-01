package com.twy.config;

import com.twy.annotation.AnnotationPointCut;
import com.twy.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy //开启AspectJ自动代理，主要针对AOP注解开启
public class JavaConfig {

    @Bean
    public UserServiceImpl UserServiceImpl(){
        return new UserServiceImpl();
    }

    @Bean
    public AnnotationPointCut annotationPointCut(){
        return new AnnotationPointCut();
    }
}
