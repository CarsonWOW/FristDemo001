package Test27;

import java.util.Random;
import java.util.Scanner;

public class henniu {
    public static void main(String[] args) {
        //猜数字游戏
        System.out.println("************猜数字游戏*****************");
        //创建随机对象
        Random henniu = new Random();
        //1到100的随机数
        int num = henniu.nextInt(100);

        while (true){
            Scanner sc=new Scanner(System.in);
            System.out.println("你猜：");
            int num1=sc.nextInt();
            if (num1<num){
                System.out.print("猜小了，继续：");
                int num2=sc.nextInt();
                if (num2>num){
                    System.out.print("猜大了，继续：");
                    int num3=sc.nextInt();
                }
            }else {
                System.out.println("猜对了，很牛,数字是"+num);
                break;
            }
        }

    }
}



