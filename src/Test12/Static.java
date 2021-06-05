package Test12;

public class Static {
    //创建构造方法
    //static属于类
    public Static(){
        System.out.println("我是在new对象时，被调用1");
    }
    static {//静态代码块，在类加载之前被调用
        System.out.println("在类加载之前被调用2");

    }

}
