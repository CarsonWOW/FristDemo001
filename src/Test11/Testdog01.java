package Test11;

public class Testdog01 {
    public static void main(String[] args) {
        //new对象，创建对象，实例化
       dog num=new dog();
        //调用方法
       /* num.getNum();
        //调用了方法，并接收了方法返回的结果
        int num1=num.getNum();
        System.out.println("返回的值为"+num1);
        //直接调用方法，并直接输出值
        System.out.println(num.getNum());*/

       //new对象，创建对象，实例化
       /* dog num=new dog();
        //调用方法
        String str=num.getstr();
        System.out.println(str);

        String str1=num.getstr2("给你一个字符串");
        System.out.println(str1);*/
       String str3=num.getstr3("字符串", 2);
        System.out.println(str3);

    }
}
