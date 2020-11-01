package com.twy.service;

import com.twy.dao.UserDao;
import com.twy.dao.UserMysqlDaoImpl;
import com.twy.dao.UserOrancleDaoImpl;

public class UserServiceImpl implements UserService {

    //实例化获取mysql数据的接口
//    UserDao userDao = new UserOrancleDaoImpl();


    private UserDao userDao;
    //我们可以利用set动态的实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    //获取数据
    public void getUser() {
       userDao.getUserData();
    }
}
