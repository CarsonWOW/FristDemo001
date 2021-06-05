package Test16;

public class InterfaceTest01 {
    public static void main(String[] args) {

        //调用静态常量不需要new对象
       // System.out.println(MyInterface.MAX_ID);

        /**
         *  调用 InterfaceImpl当中的方法
         *  1.创建对象  创建对象有两种方式
         *  第一种：实现类   变量名=new 实现类（）;
         *  第二种：接口   变量名=new 实现类（）；
         */
       // InterfaceImpl anInterface=new InterfaceImpl();
       //第一种 InterfaceImpl anInterface=new InterfaceImpl();
       //anInterface.addUser();

        //第二种
        MyInterface myInterface=new InterfaceImpl();
        myInterface.addUser();

    }
}
