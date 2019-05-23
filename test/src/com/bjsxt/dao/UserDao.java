package com.bjsxt.dao;
import com.bjsxt.pojo.User;

public interface UserDao {
    /*
    根据用户名和密码查询用户信息
    uname
    pwd
    return
     */
    User checkUserLoginDao(String uname, String pwd);
}
