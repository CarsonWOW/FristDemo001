package allday9;

import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        /**
         * 循环录入三位会员的信息
         * 会员号合法，显示录入信息
         * 否则显示录入失败
         */
        System.out.println("MyShopping管理系统>客户管理信息>添加客户信息");
        Scanner sc=new Scanner(System.in);
        int num=0;//会员号
        String birthday;//会员生日
        int score=0;//会员积分
        for(int i=1;i<=3;i++){
            System.out.println("\n请输入会员号(<4位整数>):");
            num=sc.nextInt();
            System.out.println("请输入会员生日：");
            birthday=sc.next();
            System.out.println("请输入会员积分：");
            score=sc.nextInt();
            if(num<1000 || num>9999){
                System.out.println("录入信息失败！");
                continue;
            }
            System.out.println("你录入的会员信息是：");
            System.out.println(num+"\t"+birthday+"\t"+score);

        }
        System.out.println("程序结束！");


    }
}
