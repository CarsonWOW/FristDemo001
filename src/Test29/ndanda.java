package Test29;

import java.util.HashMap;
import java.util.Set;

public class ndanda {
    public void Hash(){
        String str="nadbdad";
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for (int i=0;i<str.length();i++){
            //将字符串转换为字符数组
            char c=str.charAt(i);
            //判断key是否重复,如果重复,则进来
            if (hashMap.containsKey(c)){
                //统计次数
                int count=hashMap.get(c);
                count=count+1;
                hashMap.put(c,count);
            }else {
                hashMap.put(c,1);
            }
        }
        Set<Character> Keys=hashMap.keySet();
        for (Character c:Keys){
            System.out.println("字符"+c+":"+"出现的次数为"+hashMap.get(c));
        }
    }

    public static void main(String[] args) {
        ndanda ndanda=new ndanda();
        ndanda.Hash();
    }
}
