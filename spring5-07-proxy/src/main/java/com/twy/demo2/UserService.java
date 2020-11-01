package com.twy.demo2;

public class UserService implements UserDao {

    public void add() {
        System.out.println("增");
    }

    public void delete() {
        System.out.println("删");
    }

    public void update() {
        System.out.println("改");
    }

    public void select() {
        System.out.println("查");
    }
}
