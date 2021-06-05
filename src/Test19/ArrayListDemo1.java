package Test19;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //创建dog类对象
        Dog dog=new Dog("编号1","多多","1");
        Dog dog1=new Dog("编号2","美美","2");
        Dog dog2=new Dog("编号3","芬芬","3");
        Dog dog3=new Dog("编号4","西西","4");
        Dog dog4=new Dog("编号5","大黄","5");
        /**
         * 泛型使用
         * 1.如果没有加泛型，集合中存的数据类型不一致，循环过程中可能会报错
         * 2.通过泛型去解决上面的问题
         * List<确定你的数据类型>list=new ArrayList();
         * List<Dog>集合中只能存Dog对象
         */

        //创建ArrayList集合对象
        List lis=new ArrayList();
        //添加信息
        lis.add(dog);
        lis.add(dog1);
        lis.add(dog2);
        lis.add(dog3);
        lis.add(dog4);
        //我这里有个字符串，下面的循环会报错 类型转换错误
       // lis.add("aaa");
        //查询数据个数
        System.out.println("数据数量为:"+lis.size());

        //循环遍历,没有学增强循环
        /*for (int i=0;i<lis.size();i++){
            System.out.println(lis.get(i));
        }*/
        /**
         *  foreach使用增强循环,开发中这种使用较多
         * Dog 变量名 接受返回的值 Dog数据类型
         * list要循环的集合对象
         */
        for(Object obj:lis){
            Dog sbq=(Dog)obj;
            System.out.println(sbq);
        }
    }
}
