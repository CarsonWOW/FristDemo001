package Test29;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class kdakda {
    public static void main(String[] args) {
        String str="bdadadaudand";
        HashMap<Character,Integer> hash=new HashMap<Character,Integer>();
        //遍历循环
        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
             if (hash.containsKey(c)){
                 int count=hash.get(c);
                 count=count+1;
                 hash.put(c,count);
             }else {
                 hash.put(c,1);
             }
        }
        Set<Character> keySet=hash.keySet();
        for (Character c:keySet){
            System.out.println("字符"+c+"出现的次数为"+hash.get(c));
        }
        String str3="dadadad";





    }
}
