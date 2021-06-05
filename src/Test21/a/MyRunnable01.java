package Test21.a;

/**
 * 使用同步方法 ，网络购票
 */
public class MyRunnable01  implements Runnable {
    private int tiekct=100;
    private int num=0;
    private boolean flag=true;

    @Override
    public void run() {
        while (flag){
            sael();
        }


    }

    private synchronized void sael() {
        if (tiekct<=0){
            flag=false;
            if (!flag){
                return;
            }
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tiekct--;
        num++;
        System.out.println(Thread.currentThread().getName()+"抢到了第"+num+"张票,剩余"+tiekct+"张票!");


    }
}
class MyRunnable01Test{
    public static void main(String[] args) {
        MyRunnable01 myRunnable01=new MyRunnable01();
        Thread p1=new Thread(myRunnable01,"黄牛");
        Thread p2=new Thread(myRunnable01,"网络");
        Thread p3=new Thread(myRunnable01,"个人");
        p1.start();
        p2.start();
        p3.start();
    }
}






