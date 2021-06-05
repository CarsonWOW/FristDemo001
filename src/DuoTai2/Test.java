package DuoTai2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("*****欢迎来到宠物管理系统*********");
        Scanner sc=new Scanner(System.in);
        System.out.println("请选择你要领养的宠物  1.狗  2.企鹅  3退出");
        int num=sc.nextInt();

                if (num==1){
                    System.out.println("请为宠物取个名字:");
                    String name=sc.next();
                    Dog dog=new Dog(60,80);
                    dog.setName(name);

                    System.out.println("你要？ 1.查看宠物的自白 2.喂食 3.与宠物玩耍");
                    int num1=sc.nextInt();
                    if (num1==1){
                        Pet pet=dog;
                        pet.pirnt();
                    }else if (num1==2){
                        Master master=new Master();
                        master.feedPet(dog);
                    }else {
                        Master master=new Master();
                        master.play(dog);
                    }

                }else if (num==2){
                    System.out.println("请为宠物取个名字:");
                    String name=sc.next();
                    Penguin penguin=new Penguin(60,80);
                    penguin.setName(name);
                    System.out.println("你要？ 1.查看宠物的自白 2.喂食 3.与宠物玩耍");
                    int num1=sc.nextInt();
                    if (num1==1){
                        Pet pet=penguin;
                        pet.pirnt();
                    }else if (num1==2){
                        Master master=new Master();
                        master.feedPet(penguin);
                    }else {
                        Master master=new Master();
                        master.play(penguin);
                    }
                }else if (num==3){
                    System.out.println("退出成功！");
                }
            }

    }

