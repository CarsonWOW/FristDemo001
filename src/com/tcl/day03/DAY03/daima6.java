package com.tcl.day03.DAY03;

public class daima6 {
    public static void main(String[] args) {
        //创建数组第一种方式

        int nums[]={1,2,3,4,5,6};
        //循环变量
        for(int i=0;i<nums.length;i++){
            System.out.println(i);

        }
        //创建数组第二种方式
       // int nums2[]=new int[5];//数组的容量为5
        //num2[5]=5; 会报错
        //System.out.println(nums2[0]);//输出值都是0
        //System.out.println(nums2[1]);
        //System.out.println(nums2[4]);
        //nums2[4]=5;//给下标4赋值为5
        //System.out.println(nums2[4]);
        //创建数组第三种方式
        int nums3[]=new int[]{1,2,3,4,5};
       // int nums3[]=new int[5]{1,2,3,4,5};这种是错误的，注意笔试题
        //第三种创建方式循环
        for(int i=0;i<nums3.length;i++){
            //System.out.println(i);//打印输出下标的值
            System.out.println(nums3[i]);
        }


    }
}
