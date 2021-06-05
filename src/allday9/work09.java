package allday9;

import java.util.Scanner;

public class work09 {
    public static void main(String[] args) {
        /**
         * 有一个数列：8，4，2，1，23，344，12
         * 循环输出数列的值
         * 求数列中所有数值的和
         * 猜数游戏：从键盘中任意输入一个数据，判断数列中是否包含此数
         */
        int sum = 0;//总数
        int nums[] = {8, 4, 2, 1, 23, 344, 12};//创建数列
        System.out.println("*********循环输出数列的值***********");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "\t");
            sum += nums[i];//累加求和公式
        }
        System.out.println("\n和为：" + sum);
        //猜数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num = sc.nextInt();
        //猜数游戏：从键盘中任意输入一个数据，判断数列中是否包含此数
        boolean b=false;
        for (int i=0;i<nums.length;i++){
            if (num==nums[i]){
                System.out.println("包含此数");
                b=true;
                break;
            }else {
                System.out.println("不包含");
                b=false;
                break;
            }
        }

    }
}





















