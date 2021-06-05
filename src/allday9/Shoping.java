package allday9;

import java.util.Scanner;

public class Shoping {
    public static void main(String[] args) {
        double sum=0;//总金额
        double num[]=new double[5];
        System.out.println("请输入本月会员消费的记录");
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<5;i++){//0 1 2 3 4
            System.out.print("请输入第"+(i+1)+"笔消费金额:");//1.2.3.4.5
            double money=sc.nextDouble();
            num[i]=money;
            sum+=money;

        }
        System.out.println("序号          金额（元）");
        for (int j=0;j<num.length;j++){
            System.out.println(j+1+"              "+num[j]);
        }
        System.out.println("总金额："+"       "+sum);

    }
}
