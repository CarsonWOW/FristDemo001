package Test21.a;
//定义线程
public class MyThread03 extends Thread {
    public void run(){
        Thread thread=Thread.currentThread();
        setName("王某");
        String name=getName();

        for (int i=1;i<5;i++){
            System.out.println(name+"抢到了第"+i+"票");
        }
    }

}
