package allday9;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        /**
         * 普通顾客购物满100元，打9折
         * 会员购物打8折
         * 会员购物满200元，打7，5折
         */
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入是否是会员：1是 2不是");
        String num=sc.next();
        System.out.println("请输入购物金额：");
        double price=sc.nextDouble();
        if (num.equals("是")){
            if (price>=200){
                System.out.println("购物金额："+price*0.75);
            }else {
                System.out.println("购物金额："+price*0.8);
            }
        }if (num.equals("不是")){
            if(price>=100){
                System.out.println("购物金额："+price*0.9);
            }else {
                System.out.println("购物金额："+price);
            }
        }




    }
}
























