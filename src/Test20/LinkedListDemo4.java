package Test20;

import Test19.Phone;

import java.util.LinkedList;

public class LinkedListDemo4 {
    public static void main(String[] args) {
        //创建手机类对象
        Phone p1=new Phone("华为",4000);
        Phone p2=new Phone("vivo",5000);
        Phone p3=new Phone("oppo",2000);
        Phone p4=new Phone("小米",1000);

        //使用泛型，创建LinkedList集合
        LinkedList<Object> list=new LinkedList<Object>();
        //将手机类信息添加到集合中
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        //查询集合中的数量
        System.out.println("集合中的数量为："+list.size());
        //添加到第一个
        list.addFirst(p4);
        //添加到最后一个
        list.addLast(p1);
        //使用增强循环遍历
        for (Object obj:list){
            Phone s=(Phone)obj;//强转
            System.out.println(s);
        }

    }
}
