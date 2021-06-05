package Test19;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        //创建集合 集合默认长度为10
        ArrayList list=new ArrayList();
        //创建Dog对象,对属性进行赋值
        Dog dog=new Dog("1","欧欧","哈士奇");
        Dog dog1=new Dog("2","多多","田园犬");
        Dog dog2=new Dog("3","琪琪","哈士奇");
        Dog dog3=new Dog("4","美美","哈士奇");
        //将dog对象,添加到集合中
        list.add(dog);
        list.add(dog1);
        list.add(dog2);
        list.add(dog3);
        //获得数量
        int num=list.size();
        System.out.println("数量为:"+num);
        //循环
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //增强循环
        /*for(Dog u:list){
            System.out.println(u);
        }*/
        //得到下标为0的数据
        System.out.println("下标为0的数据:"+list.get(0));



    }
}
