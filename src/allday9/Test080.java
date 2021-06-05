package allday9;

import java.util.Scanner;

public class Test080 {
    public static void main(String[] args) {
        //99乘法表
        Scanner num=new Scanner(System.in);
        System.out.println("请输入一个数：");
        int Num=num.nextInt();

        for(int i=1;i<=9;i++){//参数初始化，条件判断，更新循环变量
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }//0+6=6 1+5=6  2+4=6 3+3=6 4+2=6 5+1=6 6+0=6
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数：");
        int val=sc.nextInt();
        for(int i=0,j=val;i<=val;i++,j--){//for循环可以定义多个变量，通过逗号，连接
            System.out.println(i+"+"+j+"="+(i+j));
        }

    }
}

