package Test13.a;
//子类继承父类
public class penguin extends pet{
    //公共属性


    public String sex="Q妹";
    /**
     * 企鹅会飞，也会跑,重写去解决
     * super,父类的意思，要看我这个类继承了哪个类
     * 1.super可以访问父类的成员和方法
     * 2.super在普通方法可以任意位置
     * 3.super在构造方法只能位于第一次
     * 4.super不能访问private修饰的成员
     * 5.静态方法中不能使用super,和this关键字
     */

    public void run(){
        super.run();
        System.out.println("飞呀飞");
    }

    //静态方法中不能使用super,和this关键字
    //public static void get(){
        //System.out.println(super.healthey);


}
