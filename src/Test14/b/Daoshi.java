package Test14.b;
//导师继承了人类
public class Daoshi extends Person {
    public String dname="导师";
    //构造方法
    public Daoshi(){
        super();//这是调用了父类的构造方法，还必须是第一位
        System.out.println("这是导师类2");
    }
}
