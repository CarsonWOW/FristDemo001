package Test21.a;

import Test21.a.MyThread02;

public class MyThread02Test {
    /* public static void main(String[] args) {
         //2.创建线程 就跟我们以前创建对象一样的
         MyThread02 myThread02=new MyThread02();
         //3.启动线程 启动线程必须是start()方法，不能是run方法
         myThread02.start();

         new MyThread02().start();
         new MyThread02().start();
         new MyThread02().start();
         new MyThread02().start();

         //4.终止线程，执行完后系统自动终止*/
    public static void main(String[] args) {
        //2.创建线程 就跟我们以前创建对象一样的
        MyThread02 myThread02 = new MyThread02();
        //3.启动线程 启动线程必须是start()方法，不能是run方法
        //笔试题  线程启动方式是（） a.run() b start()
        myThread02.start();

        new MyThread02().start();
        new MyThread02().start();
        new MyThread02().start();
        new MyThread02().start();

        //4.终止线程，执行完后系统自动终止*/
    }
}

