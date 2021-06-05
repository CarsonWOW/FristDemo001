package allday9;

import java.util.Scanner;

public class Test093 {
    public static void main(String[] args) {
        //购物金额结算
        double sum=0;//总金额
        System.out.println("请输入会员本月的消费记录：");
        Scanner sc=new Scanner(System.in);
        double nums[]=new double[5];//创建一个长度为5的double数组
        for(int i=0;i<nums.length;i++){
            System.out.print("请输入会员第"+(i+1)+"笔消费记录：");
            nums[i]=sc.nextDouble();
            sum+=nums[i];//累加求和
        }
        System.out.println("序号\t\t金额（元）");
        for(int i=0;i<nums.length;i++){
            System.out.println((i+1)+"\t\t\t"+nums[i]);
        }
        System.out.println("总金额\t\t"+sum);






    }
}











