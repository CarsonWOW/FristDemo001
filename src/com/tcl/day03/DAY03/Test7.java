package com.tcl.day03.DAY03;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        System.out.println("欢迎使用MyShipping管理系统");
        System.out.println();
        System.out.println("*******************************");
        System.out.println("1.客户信息管理");
        System.out.println("2.购物结算");
        System.out.println("3.真情回顾");
        System.out.println("4.注销");
        Boolean isRight = true;  Scanner input = new Scanner(System.in);
        System.out.print("请选择，输入数字：");
        do {

            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    isRight = true;
                    System.out.println("执行客户信心管理");
                    break;

                case 2:
                    isRight = true;
                    System.out.println("执行购物结算");
                    break;

                case 3:
                    isRight = true;
                    System.out.println("执行真情回顾");
                    break;

                case 4:
                    isRight = true;
                    System.out.println("执行注销");
                    break;

                default:
                    isRight = false;
                    System.out.print("输入错误，请重新输入数字：");
            }
        } while (!isRight);
        System.out.println("程序结束");
    }
}


























