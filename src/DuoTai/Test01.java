package DuoTai;

import Test15.a.Master01;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {

        System.out.println("****欢迎来到宠物管理系统");

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要领域的种类 1 狗   2 企鹅");
        int kind=sc.nextInt();
        Master1 master1=new Master1();
        master1.getPet1(kind);
        Pet pet=master1.getPet1(kind);
        if (pet!=null){
            System.out.println("领养成功");
            pet.print();

        }
        System.out.println("方式？ 1喂食 2玩");
        int num=sc.nextInt();
        if (num==1){
            master1.feedPet(pet);
        }else if (num==2){
            master1.play(pet);
        }




        }

    }

