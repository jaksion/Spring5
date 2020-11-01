package com.twy.demo2;

public class UserServiceProxy implements UserDao {

    private UserService userService;

    public UserServiceProxy(UserService userService){
        this.userService = userService;
    }

    public void add() {
        this.printLog("add");
        userService.add();
    }

    public void delete() {
        this.printLog("delete");
        userService.delete();
    }

    public void update() {
        this.printLog("update");
        userService.update();
    }

    public void select() {
        this.printLog("select");
        userService.select();
    }

    /**
     * 打印日志
     */
    public void printLog(String msg){
        System.out.println("打印"+msg+"日志！！！");
    }
}
