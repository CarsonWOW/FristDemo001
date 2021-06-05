package Test20;

import Test19.Dog;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        //创建对象
        Dog p1=new Dog("编号1","小美","1");
        Dog p2=new Dog("编号1","小四","2");
        Dog p3=new Dog("编号1","小二","3");
        Dog p4=new Dog("编号1","小一","4");
        //创建Arraylist集合
        //使用泛型,规定集合的类型为狗的对象
        List<Dog> list=new ArrayList();
        //添加信息到集合中
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        //查询集合中的数量
        System.out.println("集合中的数量为："+list.size());
        //使用增强循环遍历
        for (Dog s:list){
            System.out.println(s);
        }
    }
}
