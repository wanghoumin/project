package com.bjsxt.servlet;

import com.bjsxt.service.Impl.UserServiceImpl;
import com.bjsxt.service.UserService;
import com.bjsxt.pojo.User;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class servlet extends HttpServlet {


    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //设置请求编码格式
        request.setCharacterEncoding("utf-8");
        //设置是响应编码格式
        response.setContentType("text/html;charset=utf-8");
       //获取操作法
        String oper=request.getParameter("oper");
        if ("login".equals(oper)){
            //调用登陆处理方法
            checkUserLogin(request,response);
        }else if ("reg".equals(oper)){
            //调用注册功能
        }else{
            System.out.println("Not Found"+oper);
        }
    }
    //处理登陆
    private void checkUserLogin(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //获取请求信息
        String uname=request.getParameter("uname");
        String pwd=request.getParameter("pwd");
        System.out.println(uname+":"+pwd);
            //处理请求信心
                //获取service层对象
        UserService us=new UserServiceImpl();
                //校验
        User u=us.checkUserLoginService(uname,pwd);
        if (u!=null){
            response.sendRedirect("pwdpage.jsp");
        }
            //响应处理信息
            //直接响应
            //请求转发

    }



}
