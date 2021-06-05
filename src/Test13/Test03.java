package Test13;

public class Test03 {
    public static void main(String[] args) {
        //之前调用静态方法，需要new一个对象
        //之前的调用方法，就算你加了static修饰符，也一样调研
        /*StaticDemo03 s1=new StaticDemo03();
        System.out.println(s1.a);
        System.out.println(s1.b);
        s1.getA();
        s1.getB();*/
        //static修饰的方法调用，可以用类名.属性名，或者类名.方法名
        System.out.println(StaticDemo03.b);
        StaticDemo03.getB();
    }
}
