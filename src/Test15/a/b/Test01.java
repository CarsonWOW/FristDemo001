package Test15.a.b;

import java.util.Scanner;

public class Test01 {
    //通过输入数字领养宠物，并进行喂食
    public static void main(String[] args) {
        //Master master=new Master();
        //给狗喂食
       /* Dog dog=new Dog();
        //这里需要一个参数，参数类型为Dog对象
        master.feed(dog);
        dog.print();
        //给企鹅喂食
        Penguin penguin=new Penguin();
        master.feed(penguin);
        penguin.print();*/
       //把dog对象给Pet
       // Dog dog=new Dog();
        //Pet pet=dog;//自动类型转换、

        //Dog dog1=(Dog) pet;//强制转换类型 向下转型
        System.out.println("*******欢迎来到宠物系统*******");
        Scanner sc=new Scanner(System.in);

        //创建主人类1
        Master master=new Master();
        System.out.println("请输入你要领养的宠物 1/狗狗 2/企鹅");
        int typed=sc.nextInt();
        //选择领养哪种宠物
        master.getpet(typed);
        Pet pet=master.getpet(typed);

        if(null!=pet){
            System.out.println("领养成功");
            //1，吃的方式
            pet.eat();
            //2.打印输出宠物信息
            pet.print();
            //3，玩
            master.play(pet);
            //再次打印输出信息
            pet.print();




    }else {
        System.out.println("领养失败");
    }

    }
}
