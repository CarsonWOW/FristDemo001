package Test14.a;

public class Test01 {
    //修饰符
    private String name1="张三";
    //默认修饰符
    String name2="张三";
    //受保护的
    protected String name3="张三";
    public String name4="张三";

    public static void main(String[] args) {
        //本类，所有修饰符都可以访问
        Test01 T1=new Test01();
        System.out.println(T1.name1);
        System.out.println(T1.name2);
        System.out.println(T1.name3);
        System.out.println(T1.name4);
    }

}

