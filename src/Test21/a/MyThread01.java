package Test21.a;
/**
 * 线程演示
 */

public class MyThread01 {
    //一个类必须有main才能运行，一个类只能有有个main
    //main就是我们的主线程
    public static void main(String[] args) {
       //1.获取当前主线程
        Thread thread=Thread.currentThread();
        System.out.println("当前主线程的名为"+thread.getName());//main

        //2.如何修改线程名
        thread.setName("修改main");
        System.out.println("修改后的线程名："+thread.getName());
    }
}
