package Test19;


import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo3 {
    public static void main(String[] args) {
        //创建手机类对象
        Phone phone=new Phone("华为",5999);
        Phone phone1=new Phone("OPPO",4999);
        Phone phone2=new Phone("Vivo",3999);
        Phone phone3=new Phone("OnePls",1999);
        //创建LinkedList集合对象
        LinkedList list=new LinkedList();
        list.add(phone);
        list.add(phone1);
        list.add(phone2);
        list.add(phone3);
        //查询数据个数
        System.out.println("数据个数为："+list.size());
        //添加到第一个
        list.addFirst(phone3);
        //添加到最后一个
        list.addLast(phone);
        //循环遍历
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //获取第一个
        System.out.println("获取第一个："+list.getFirst());

    }























}
