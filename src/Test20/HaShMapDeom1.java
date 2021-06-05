package Test20;

import Test19.Dog;

import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HaShMapDeom1 {


    public static void main(String[] args) {
        Dog dog=new Dog("编号1","多多","1");
        Dog dog1=new Dog("编号2","美美","2");
        Dog dog2=new Dog("编号3","芬芬","3");
        Dog dog3=new Dog("编号4","西西","4");
        Dog dog4=new Dog("编号5","大黄","5");
        //创建HashMap集合
        /**
         * 使用泛型
         * Map<确定泛型的数据类型，这里有2个数据类型> map=new HashMap();
         * Map<key的数据类型,value数据类型> map=new HashMap();
         */
        Map<String,Dog> map=new HashMap();
        map.put("dog1",dog);
        map.put("dog2",dog);
        map.put("dog3",dog);
        map.put("dog4",dog);
        map.put("dog",dog);
        //通过ｋｅｙ得到值
       // Object sc=map.get("dog1");
        //System.out.println(sc);
        //迭代器 以后开发不会用，了解即可


       //返回的是set set存储的是一组不唯一的对象
      //System.out.println(keys);
      //然后把keys  存储到迭代器:Iterator
    // Iterator it= keys.iterator();

     //3.循环遍历
       // while (it.hasNext()){//每次循环判断是否还有值，如果有值返回true,没有值返回false
            //把Key值取出来，一个一个的取
           /* String key=(String)it.next();
            System.out.println("取到的key值为"+key);
            //通过key获取VaLUE值
            Object obj=map.get(key);
            System.out.println(obj);*/

        //1.获得所有的Keys
       Set<String>key= map.keySet();
        //通过foreach  使用增强循环
        for (String keys:key){
            System.out.println("key值为"+key);
        }

        //通过key值得到值
        System.out.println(map.get(key));
         //Dog s1=map.get(key);
        //System.out.println(s1);

    }



}


