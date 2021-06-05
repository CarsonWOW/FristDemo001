package allday9;

import java.util.Scanner;

public class Teset10 {
    public static void main(String[] args) {
        //验证用户登录信息，用户登录验证最多3次
        String usename;//用户名
        String password;//密码
        int i=0;
        Scanner sc=new Scanner(System.in);
        for( i=0;i<3;i++) {
            System.out.print("请输入用户名：");
            usename = sc.next();
            System.out.print("请输入密码：");
            password = sc.next();
            if ("jim".equals(usename) && "123456".equals(password)) {
                System.out.println("欢迎登录MyShopping系统！");
                break;
            } else {
                System.out.println("输入错误，你还有" + (2 - i) + "次机会！");
                continue;
            }
        }   if(i==3){
            System.out.println("对不起，你3次都输错了");
        }







    }
    }

