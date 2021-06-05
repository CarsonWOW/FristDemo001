package allday9;

import java.util.Scanner;

public class work8 {
    public static void main(String[] args) {
        //循环录入JAVA课的学生成绩，统计分数大于等于80分的学生比例
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学生总人数：");
        double student=sc.nextInt();//学生总人数
        int sum=0;//80分以上的人数
        for(int i=1;i<=student;i++){
            System.out.println("请输入第"+i+"位学生的成绩：");
            int score=sc.nextInt();//学生成绩
            if(score>80){
                sum++;
            }
        }
        System.out.println("80分以上的学生人数为："+sum);
        System.out.println("80分以上的学生人数比例为："+(sum/student)*100+"%");
    }
}



