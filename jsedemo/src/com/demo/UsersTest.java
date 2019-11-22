package com.demo;

import java.util.Scanner;

public class UsersTest {
    public static void main(String[] args) {
        Users chaoji = new Users();
        chaoji.setUserName("韩佳宁");
        chaoji.setPassword("963");

        //用户登录过程
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String a = sc.next();
        System.out.println("请输入密码：");
        String b = sc.next();

        //比较是否存在该用户
        Users u = login(a, b, chaoji);
        if (u != null) {
            System.out.println("用户名：" + u.getUserName() + "密码：" + u.getPassWord());
        } else {
            System.out.println("登陆失败");
        }
    }

    //用户登录
    public static Users login(String uname, String psd, Users chaoji) {
        //判断参数是否为空
        //判断用户是否存在
        if (uname.equals(chaoji.getUserName()) && psd.equals(chaoji.getPassWord())) {
           return chaoji;
        } else {
            return null;
        }
    }

}

