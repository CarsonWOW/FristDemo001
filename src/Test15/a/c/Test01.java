package Test15.a.c;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        System.out.println("**********欢迎来到宠物系统***********");
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.print("请选择你要领养的宠物名字：");
            String name=sc.next();
            System.out.println("请选择你要领养的宠物类型：1狗狗 2企鹅 3退出程序");
            int choice=0;
            choice=sc.nextInt();

            if(choice==1){
                System.out.println("请选择狗狗的品种：1:品种1 2:品种2");
                String strin=null;
               int strintype=sc.nextInt();
                if(strintype==1){
                    strin="品种1";
                }if(strintype==2){
                    strin="品种2";
                }
                //创建狗狗类
                Dog dog=new Dog();
                dog.name=name;
                dog.strin=strin;
                dog.love=100;
                dog.health=90;
                dog.print();

            }else if(choice==2){
                System.out.println("请选择企鹅的性别：1Q妹 2Q仔");
                String sex=null;
                int sextype=sc.nextInt();
                if(sextype==1){
                    sex="Q妹";
                }
                if(sextype==2){
                    sex="Q仔";

                }
                //创建企鹅类
                Penguin penguin=new Penguin();
                //赋值
                penguin.health=60;
                penguin.name=name;
                penguin.sex=sex;
                penguin.love=80;
                penguin.print();

            }else if(choice==3){
                System.out.println("退出程序成功！");
                break;
            }else {
                System.out.println("输入错误！");
                break;
            }



        }
    }
}
