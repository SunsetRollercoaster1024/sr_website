package com.sr.website.util;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        // 定义用户名和密码
        String username = "admin";
        String password = "123456";
        // 定义一个循环，用于重复输入用户名和密码
        for (int i = 0; i < 3; i++) {
            // 使用Scanner类获取用户的输入
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String name = scanner.next();
            System.out.println("请输入密码：");
            String pwd = scanner.next();
            // 判断用户输入的用户名和密码是否正确
            if (name.equals(username) && pwd.equals(password)) {
                System.out.println("登录成功！");
                break;
            } else {
                if (i == 2) {
                    System.out.println("登录失败！");
                } else {
                    System.out.println("用户名或密码错误，请重新输入！");
                }
            }
        }
    }
}