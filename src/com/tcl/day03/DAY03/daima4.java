package com.tcl.day03.DAY03;

/**
 * 数组
 */

public class daima4 {

    public static void main(String[] args) {
        int num=10;//以前存一个变量，只能存一个数字
        //创建，定义一个int数组变量可以存储多个数字
        int nums[] ={1,2,3,4,5};
        System.out.println(nums);//这个后面讲，乱代码[I@6acbcfc0
        System.out.println(nums[2]);//获取下标为2的值，2+1，输出的结果为3
        System.out.println(nums[4]);//获取下标为4的值，就是4+1，输出结果为5
        //Array Index OutOfBounds Exception 数组下标 越界
       // System.out.println(nums[5]);//数组里面没有下标5，会报错
        //想把数组里的1，改为10
        nums[0]=10;
        System.out.println(nums[0]);
    }
}
