package Test21.a;

/**
 * 模拟抢票
 * 用线程进行多人模拟抢票
 */
public class Mythread04 extends Thread {
    private int ticket=100;//总票数
    private int num=0;//记录票数
    private boolean flag=true;
    @Override
    public  void  run() {
        while (flag){
            sael();
        }

    }



    private synchronized void sael() {
       if (ticket>0){
           try {
               Thread.sleep(100);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           ticket--;
           num++;
           System.out.println(Thread.currentThread().getName()+"抢到了第"+num+"张票,还剩"+ticket+"张票");
       }else if (ticket<=0){
           flag=false;
           return;
       }



    }


}


class Test03{
    public static void main(String[] args) {
        Mythread04 p1 =new Mythread04();
        Mythread04 p2 =new Mythread04();
        Mythread04 p3 =new Mythread04();
        p1.setName("黄牛");
        p2.setName("个人");
        p3.setName("网络");
        p1.start();
        p2.start();
        p3.start();
    }
}



