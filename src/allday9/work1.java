package allday9;

import java.util.Scanner;

public class work1 {
    public static void main(String[] args){
        int random = (int) (Math.random() * 10);//随机生成个位数
        System.out.println("数："+random);
        System.out.println("我行我素购物管理系统》幸运抽奖");
        System.out.println("\n请输入四位会员号：");
        //接受指令信息
        Scanner Num=new Scanner(System.in);
        int guest;//顾客会员号
        guest=Num.nextInt();
        //抽奖规则：会员号的百位数字等于产生的随机数即为幸运会员
        int baiwei=guest/100%10;//百位数字等于输出的四位会员号除以100，得到百位数，除以10，得到商
        if(baiwei==random){
            System.out.println(guest+"号顾客是幸运顾客，获得精美MP3一个,随机数是"+random);
        }else {
            System.out.println(guest+"号客户，谢谢您的支持");

        }



    }
}



