package com.tcl.day03.DAY03;

import java.util.Scanner;

public class daima2 {
    public static void main(String[] args) {
        int[] nums = {8,4,2,1,23,344,12};
// 遍历输数数组值
        for(int num : nums) {
            System.out.print(num+" ");
        }
        System.out.println("\n-------------------------");
// 求和
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        System.out.println("数列的和为："+sum);
        System.out.println("-------------------------");
// 从键盘中任意输入一个数据，判断数列中是否包含此数
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int inputNum = input.nextInt();
// 遍历数组 查看是否有相同的数值
// 创建一个标记，用于最终判断记过
        boolean flag = false; // 假定不存在该值

        for(int num : nums) {
            if(inputNum == num) {
                flag = true; // 更改标记
                break;
            }
        }

// 判断标记
        if(flag) {
            System.out.println("包含此值");
        }else {
            System.out.println("不包含此值");
        }
    }
    }










