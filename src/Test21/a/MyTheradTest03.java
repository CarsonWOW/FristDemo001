package Test21.a;

public class MyTheradTest03 {
    public static void main(String[] args) {
        //创建线程
        MyThread03 myThread03=new MyThread03();
        //启动线程
        new MyThread03().start();


    }
}
