package allday9;

import java.util.Scanner;

public class worl3 {
    public static void main(String[] args) {
        /**
         * 如果成绩进入10秒以下，就进入决赛，决赛分为男子组和女子组
         * 否则，继续努力，退出比赛
         */
        int score;//成绩

        Scanner Num=new Scanner(System.in);//接受输出信息指令
        System.out.println("请输入你的成绩:");
        score=Num.nextInt();
        if(score<10){
            System.out.println("恭喜你，进入决赛");
        }else {
            System.out.println("继续努力，退出比赛");
        } //性别
        String sex;//性别
        Scanner sc=new Scanner(System.in);//接收输出信息指令
        System.out.println("请输入你的性别：");
        sex=sc.next();
        if(sex.equals("男") ) {
            System.out.println("进入男子组");
        }else{
            System.out.println("进入女子组");
        }

        }








    }
        


