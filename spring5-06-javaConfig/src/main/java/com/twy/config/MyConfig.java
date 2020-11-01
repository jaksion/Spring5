package com.twy.config;

import com.twy.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//Configuration是一个配置类，就是我上面写的beans.xml
@Configuration
@ComponentScan("com.twy.config")
public class MyConfig {

    //注册一个bean，方法名相当于bean标签中的id标签
    //返回值相当于bean标签中的class属性
    @Bean("user")
    public User user(){
        return new User();
    }
}
