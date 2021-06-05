package LingYangChongWu;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Test {
   private static Scanner sc=new Scanner(System.in);
   private static Pet pet=new Pet();
    public static void main(String[] args) {
        System.out.println("*****欢迎来到宠物店******");
        System.out.print("请输入要领养的宠物名字:");
        String name=sc.next();
        pet.setName(name);
        System.out.print("请选择你要领养的宠物类型:1 狗  2企鹅");
        int num=sc.nextInt();
        if (num==1){
            System.out.println("请选择狗的性别:1Q仔 2Q妹 ");
            int sex=sc.nextInt();
            if (sex==1){
                pet.setSex("Q仔");
            }else {
                pet.setSex("Q妹");
            }
                pet.speak();
        }else if (num==2){
            System.out.println("请选择企鹅的性别:1Q仔 2Q妹");
            int sex=sc.nextInt();
            if (sex==1){
                pet.setSex("Q仔");
            }else {
                pet.setSex("Q妹");
            }
                pet.speak();
        }
    }
}
