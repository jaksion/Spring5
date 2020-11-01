package com.twy.pojo;

public class Hellow {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "hellow{" +
                "name='" + name + '\'' +
                '}';
    }
}
