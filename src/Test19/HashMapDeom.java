package Test19;

import java.util.HashMap;
import java.util.Map;

public class HashMapDeom {
    public static void main(String[] args) {
        //1.创建HashMap集合
        Map maps= new HashMap();

        //2.存值  通过key value存值  key：键 value:值
        maps.put("CN","中国");
        maps.put("JP","日本");

        //key是不能重复的，如果重复直接覆盖 valu可以重复
        maps.put("DG","东莞");
        maps.put("DG","岛国");

        //3.查询总共有多少条数据
        System.out.println("总共有"+maps.size()+"条数据");

        //4，获取map中的值
        String place=(String)maps.get("DG");
        System.out.println(place);
        System.out.println(maps.get("CN"));

    }
}
