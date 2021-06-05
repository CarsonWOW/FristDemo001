package Test21.a;

/**
 * 线程四个步骤
 * 1.定义线程
 * 创建线程的第一种方式 继承Thread
 * 2.继承Thread
 * 3.重写run方法
 */
public class MyThread02 extends Thread {

    public void run(){
        //获取子线程名的第一种方式
        Thread thread=Thread.currentThread();
        //以后的业务代码是在这里操作的
        //System.out.println("线程名为"+thread);
        //获取线程名的第一种方式
        //System.out.println("子线程名为："+thread.getName ());
        //第一种修改子线程名方式
        setName("修改了");
        //获取子线程名的第二种方式
        String name=getName();
        System.out.println("子线程名为"+name);

    }

}
