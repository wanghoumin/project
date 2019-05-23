package com.bjsxt.service;
import com.bjsxt.pojo.User;
public interface UserService {
    /*
    校验用户登陆
     */
    User checkUserLoginService(String uname,String pwd);
}
