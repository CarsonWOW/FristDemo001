package com.tcl.day03.DAY03;

/**
 * 数组
 * String类型
 */

public class daima5 {
    public static void main(String[] args) {
        //定义，创建一个String类型数组变量
        String strs[]={"a","b","c","d","e"};
        System.out.println(strs[2]);//获取下标为2的值，就是c
        //strs[2]="f";
        System.out.println(strs[2]);//修改值，跟int数组一样
        //数组的容量是固定的，不能获取多余的下标和值,否则会报错（数组，下标，越界，异常）
        //strs[5]="p";
        //查询入组容量：
        System.out.println("数组的长度为："+strs.length);
        System.out.println("循环-----------------开始");
        //怎样依次输出数组里面的数 用 循环
        for(int i=0;i<strs.length;i++){
           // System.out.println(i);//输出打印得到下标的值
            System.out.println(strs[i]);
        }

    }

}
