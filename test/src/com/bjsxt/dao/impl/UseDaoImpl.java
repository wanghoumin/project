package com.bjsxt.dao.impl;

import com.bjsxt.dao.UserDao;
import com.bjsxt.pojo.User;

import java.sql.*;

public class UseDaoImpl implements UserDao {
    //根据用户名和密码查询用户信息
    @Override
    public User checkUserLoginDao(String uname, String pwd) {
        //声明jdbc对象
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        //声明变量
        User u=null;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/connPractice", "root", "Amber123whm@@@");
            //创建sql命令
            String sql = "SELECT * FROM connPractice.t_user where uname=? and pwd=?";
            //创建sql命令对象
            ps = conn.prepareStatement(sql);
            //给占位符赋值
            ps.setString(1, uname);
            ps.setString(2, pwd);
            //执行sql
            rs=ps.executeQuery();
            //遍历结果
                while(rs.next()){
                   //给变量赋值
                    u=new User();
                    u.setUid(rs.getInt("Uid"));
                    u.setUname(rs.getString("uname"));
                    u.setPwd(rs.getString("pwd"));
                    u.getSex(rs.getString("sex"));
                    u.getAge(rs.getInt("age"));
                    u.getBirth(rs.getString("birth"));


                }


        }catch (Exception e){
            e.printStackTrace();
        }finally {

            //关闭资源
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        //返回结果

        return u;
    }
}
