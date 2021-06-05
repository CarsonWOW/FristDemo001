package Test21.b;

public class MyRunnableTest {
    public static void main(String[] args) throws InterruptedException {
        //1.创建MyRunnabl对象
        MyRunnable myRunnable=new MyRunnable();

        //2.创建线程对象， 把MyRunnabl当做参数，传递过去
        Thread t1=new Thread(myRunnable,"子线程1");
        Thread t2=new Thread(myRunnable,"子线程2");
        Thread t3=new Thread(myRunnable,"子线程3");
        //设置优先级别 ，一般不用，并不是一定会优先，默认统一为5
        //t1  .setPriority(Thread.MAX_PRIORITY);
        //System.out.println("111");
        //休眠
        //Thread.sleep(4000);//休息4秒
        //System.out.println("222");



        //启动线程
        t1.start();
        t2.start();
        t3.start();
        //查看线程是否是活动状态
        System.out.println(t1.isAlive());
    }
}
