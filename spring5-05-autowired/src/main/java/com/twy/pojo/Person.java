package com.twy.pojo;

import org.springframework.beans.factory.annotation.Autowired;


public class Person {
    @Autowired
    private Dog dog;

    @Autowired
    private Cat cat;

    private String name;

    public Dog getDog() {
        return dog;
    }

    public Cat getCat() {
        return cat;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "dog=" + dog +
                ", cat=" + cat +
                ", name='" + name + '\'' +
                '}';
    }
}
