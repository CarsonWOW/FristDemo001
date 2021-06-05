package Test11;

import java.util.Scanner;

public class Penguin {
    //宠物领养
    //发现公共属性
    public int healthy=100;//健康值
    public int love=0;//亲密度
    public String name;
    public String sex;
    public void print(){
        System.out.println("宠物的自白：我的名字叫"+name+",健康值是"+healthy+",和主人的亲密度是"+love+",性别是"+sex);
    }



    public static void main(String[] args) {
        //创建对象
        Penguin num=new Penguin();
        System.out.println("欢迎来到宠物店！");
        Scanner sc=new Scanner(System.in);
        System.out.print("请选择你要领养宠物的名字:");
        String name=sc.next();
        num.name=name;
        System.out.print("请选择你要领养宠物的类型：1/狗狗 2/企鹅");
        int kind=0;
        kind=sc.nextInt();
        if(kind==1){
            dog Dog=new dog();
            System.out.println("领养狗成功：");
            Dog.run();
        }else if(kind==2){

            System.out.println("领养企鹅成功,请选择企鹅的性别：1/Q仔 2/Q妹");
            int sex1=0;
            sex1=sc.nextInt();
            if(sex1==1){
                num.sex="Q仔";
            }if(sex1==2){
                num.sex="Q妹";
            }
            num.print();

        }else{
            System.out.println("输入有误");
        }







        }








    }

