package allday9;

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        //循环录入成绩，并计算平均分，如果某分数录入为负数，停止录入并提示录入错误
        Scanner sc=new Scanner(System.in);
        int sum=0;//总成绩
        int score=0;//成绩
        int i=1;
        for(;i<=4;i++){
            System.out.println("请输入第"+i+"门成绩；");
            score=sc.nextInt();
            sum+=score;//累计相加公式
            if(score<0){
                System.out.println("输入错误，请重新输入");
                break;
            }

        }   System.out.println("总成绩为:"+sum);
            System.out.println("平均分为："+sum/5);
        System.out.println(i);
        System.out.println(i);

    }
    }









