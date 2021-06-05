package Test14.a;

import Test14.a.Test01;

public class Test02 {
    public static void main(String[] args) {
        Test01 T1=new Test01();
        //同包，不同类，private不能访问
       // System.out.println(T1.name1);
        System.out.println(T1.name2);
        System.out.println(T1.name3);
        System.out.println(T1.name4);
    }
}
