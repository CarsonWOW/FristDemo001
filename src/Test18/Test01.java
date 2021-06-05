package Test18;

import Test14.f.Electron;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {//JAVA虚拟机自动处理异常
        Person person=new Person();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入性别：");
        String sex=sc.next();
       try {
           person.setSex(sex);//可能会发生异常的代码
       }catch (Exception e){//捕获异常
           e.printStackTrace();//
       }

        System.out.println("性别为："+person.getSex());
    }
}
