package Test13;
/**1.本类中的普通方法可以调用静态属性和非静态属性
 * 2.静态方法中，只能访问静态修饰的属性，不能访问非静态修饰的属性
 * 3.不管是静态方法还是普通方法，都可以定义一个普通属性，非static修饰的属性
 * 4.不管是静态方法还是普通方法,都不可以定义一个静态属性，static修饰的属性，因为static属于类
 * 5.静态方法不能使用 this,super ，super后面会重点讲
 * 6.static修饰的方法，称为工具方法，因为不需要实例化，比如  Math.random()等等
 */

public class StaticDemo03 {
    //定义一个普通属性，成员变量
    public int a=0;
    //定义一个静态属性
    public static int b=0;

    //定义普通方法
    public void getA(){//本类中的普通方法可以调用静态属性和非静态属性
        /*System.out.println(a);
        System.out.println(b);*/

    }
    //定义静态方法
    public  static void getB(){
       // System.out.println(a);
        System.out.println(b);
        //int c=0;
        //static int d=10;不能定义静属性，因为static属于类
        System.out.println("调用了静态方法");

    }
}
