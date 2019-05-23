package com.bjsxt.pojo;

import java.util.Objects;

public class User {
    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", pwd='" + pwd + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", birth='" + birth + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return uid == user.uid &&
                age == user.age &&
                uname.equals(user.uname) &&
                pwd.equals(user.pwd) &&
                sex.equals(user.sex) &&
                birth.equals(user.birth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, uname, pwd, sex, age, birth);
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSex(String sex) {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge(int age) {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirth(String birth) {
        return this.birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    private int uid;
    private String uname;
    private String pwd;
    private String sex;
    private int age;
    private String birth;

}
