package Test21.a;

import static java.lang.Thread.sleep;

/**
 * 用多线程进行模拟多人爬山
 */
public class ClambNew implements Runnable {
    private int time;//爬100米的时长
    private int tall;//总共爬了多少米


    public ClambNew(int time, int tall) {
        this.time = time;
        this.tall = tall;

    }


    @Override
    public void run() {
        while (true){
            if (tall==0){
                System.out.println(Thread.currentThread().getName()+"到达了终点********");
                return;
            }
            tall--;
            if (tall>0){
                System.out.println(Thread.currentThread().getName()+"爬了100米"+",还剩"+tall*100+"米");
                try {
                    sleep(this.time);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}





class ClambNewTest{
    public static void main(String[] args) {
        ClambNew clambNew=new ClambNew(1000,10);
        ClambNew clambNew1=new ClambNew(1500,10);
        ClambNew clambNew2=new ClambNew(2000,10);
        Thread p1=new Thread(clambNew,"猛男");
        Thread p2=new Thread(clambNew1,"年轻人");
        Thread p3=new Thread(clambNew2,"老年人");
        p1.start();
        p2.start();
        p3.start();
    }
}



