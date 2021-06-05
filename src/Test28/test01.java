package Test28;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("请输入会员号：");
            int num=sc.nextInt();
            if(num>=1000 && num<=9999){
                System.out.println("合法，已录入的会员信息是："+num);
                break;
            }else {
                System.out.println("不合法");
            }
        }
        }

}
