package Test20;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {
    public static void main(String[] args) {
        //创建电脑类
        Computer p1=new Computer("联想",4999);
        Computer p2=new Computer("戴尔",3999);
        Computer p3=new Computer("三星",2999);
        Computer p4=new Computer("苹果",9999);
        //使用泛型，创建Hashmap集合
        Map<String,Computer> map=new HashMap<>();
        //将信息添加到集合中
        map.put("p1",p1);
        map.put("p2",p2);
        map.put("p3",p3);
        map.put("p4",p4);
        //通过key得到值
        Object obj=map.get("p1");
        System.out.println("第一次得到的值："+obj);
        //查询集合中的数量
        System.out.println("集合中的数量为："+map.size());
        //获得所有key的值
        Set<String>keys=map.keySet();
        //增强循环   Key值遍历
        for (String key:keys){
            System.out.println("key值为："+key);
        }
        //增强循环 value遍历
        for (String key:keys){
            System.out.println(map.get(key));
        }
    }
}
