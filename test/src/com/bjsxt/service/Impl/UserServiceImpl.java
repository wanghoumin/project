package com.bjsxt.service.Impl;
import com.bjsxt.dao.UserDao;
import com.bjsxt.dao.impl.UseDaoImpl;
import com.bjsxt.pojo.User;
import com.bjsxt.service.UserService;

import java.lang.ref.SoftReference;

public class UserServiceImpl implements UserService {
    //声明DAO层对象
    UserDao ud=new UseDaoImpl();
    //用户登陆
    @Override
    public User checkUserLoginService(String uname, String pwd){

        return ud.checkUserLoginDao(uname, pwd);
    }
}