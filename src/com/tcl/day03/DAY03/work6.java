package com.tcl.day03.DAY03;

import java.util.Scanner;

public class work6 {
    public static void main(String[] args) {
        /**
         * x<2000 打9折
         * 2000<=X<4000 打8折
         * 4000<=X<8000 打7折
         * x>=8000 打6折
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入会员积分：");
        int x=sc.nextInt();
        if(x<2000){
            System.out.println("该会员享受的折扣为："+0.9);
        }else if(2000<=x && x<4000){
            System.out.println("该会员享受的折扣为："+0.8);
        }else if(4000<=x && x<8000){
            System.out.println("该会员享受的折扣为:"+0.7);
        }else{
            System.out.println("该会员享受的折扣为："+0.6);
        }
    }






}

