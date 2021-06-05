package Test12;

public class Testphone {
    public static void main(String[] args) {
        //new对象，创建对象，实例化，这是调用普通方法
        phone num=new phone();//实例化之前，已经输出打印了无参构造方法一次
        //调用一个有参的构造方法
        phone num1=new phone(100,"华为");
        phone num2=new phone("华为",4999,"安卓系统",100);



    }

}
