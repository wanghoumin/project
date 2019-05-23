<%--
  Created by IntelliJ IDEA.
  User: admisnister
  Date: 2019-05-17
  Time: 14:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
        <title>Loginpage</title>
        <link rel="stylesheet" type="text/css" href="css/login.css"/>
    </head>
<body>
<form action="user" method="post" >
<div class="content">
    <div class="panel">
        <div class="group">
            <ul>
                <li><label>username</label></li>
                <li><input type="text" name="uname" placeholder="username" /></li>
            </ul>
            <ul>
                <li><label>password</label></li>
                <li><input type="password" name="pwd" placeholder="password" /></li>
            </ul>
        </div>
        <div class="login">
            <input type="hidden" name="oper" value="login"/>
            <button type="submit" value="submitt">login</button>
        </div>
    </div>
    <div class="register">
        <button type="button">registration</button>
    </div>
</div>
</form>
</body>
    </body>
    </html>
