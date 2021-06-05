package com.tcl.day03.DAY03;

import java.util.Scanner;

public class daima3 {
    public static void main(String[] args) {
        //张三每天阅读代码，写代码  如果合格就不用再写，如果不合格则再继续
        Scanner sc = new Scanner(System.in);

        System.out.println("完成了吗,ok了没有 y/n");

       /* while (!true){//!就是取反  如果是true那就就是false
            System.out.println("这是死循环");
        }*/
        String answer=sc.next();
       /*while (answer.equals("n")){
           //这里面如果没完成才需要再继续吧
           System.out.println("阅读代码，继续做题");
           //如果answer不变就会是死循环 老师必需检查
           System.out.println("老师再检查，完成了吗,ok了没有 y/n");
           answer=sc.next();
       }*/

        //while (!answer.equals("y")){
        while (!"y".equals(answer)){
            //这里面如果没完成才需要再继续吧
            System.out.println("阅读代码，继续做题");
            //如果answer不变就会是死循环 老师必需检查
            System.out.println("老师再检查，完成了吗,ok了没有 y/n");
            answer=sc.next();
        }

        System.out.println("完成了。休息去了");

        //学生数*(1+0.25)

    }
}





