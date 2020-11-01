package com.twy.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//组件，注入User
@Component
public class User {

    //给name注入值
    @Value("twy")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
