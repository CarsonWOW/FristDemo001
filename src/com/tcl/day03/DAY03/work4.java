package com.tcl.day03.DAY03;

public class work4 {
    public static void main(String[] args) {
        //商品单价
        int Tshirt = 245;
        int shoes = 570;
        int borand = 320;
        //商品数量
        int num1 = 2;
        int num2 = 1;
        int num3 = 1;
        //商品金额
        int Tpirece = Tshirt * num1;
        int spirece = shoes * num2;
        int bpirece = borand * num3;
        //商品折扣
        int discout = 8;
        //消费总金额
        double total = (Tpirece + spirece + bpirece) * discout/10;
        //实际交费
        int payment = 1500;
        //找钱
        double rest = payment - total;
        //结算本次购物积分
        int score = (int) (total / 100 * 3);
        //打印购物小票
        System.out.println("* * * * * * * * * * * *消费单* * * * * * * * * * * * *");
        System.out.println("购买物品\t\t"+"单价\t\t"+"个数\t\t"+"金额");
        System.out.println("T恤\t\t\t"+"￥"+Tshirt+"\t\t"+num1+"\t\t\t"+Tpirece);
        System.out.println("网球鞋\t\t"+"￥"+shoes+"\t\t"+num2+"\t\t\t"+spirece);
        System.out.println("网球拍\t\t"+"￥"+borand+"\t\t"+num3+"\t\t\t"+bpirece);

        System.out.println("折扣："+"\t\t"+discout+"折");
        System.out.println("消费总金额："+"\t"+"￥"+total);
        System.out.println("实际交钱："+"\t"+"￥"+payment);
        System.out.println("找钱："+"\t\t"+"￥"+rest);
        System.out.println("本次购物获得的积分是："+"\t"+score);










    }

}

