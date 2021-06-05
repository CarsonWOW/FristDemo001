package Test21.b;

public class ClambNew1 implements Runnable{
    private int time;//爬100米所需时间
    private int num;//路程
    private boolean flag=true;

    public ClambNew1(int time, int num) {
        this.time = time;
        this.num = num;
    }

    @Override
    public void run() {
        while (flag){//当flag为true的时候,跳出循环
            clamb();
        }

    }
    private synchronized void clamb() {
        if (num==0){
            //当为true的时候跳出循环
            flag=false;
            System.out.println("********"+Thread.currentThread().getName()+"达到了终点");
            return;
        }else {
            try {
                Thread.sleep(this.time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"爬了100米,"+"剩余"+num*100+"米");
            num--;

        }
    }
}
class ClambNew1Test{
    public static void main(String[] args) {
        ClambNew1 clambNew1=new ClambNew1(1000,10);
        ClambNew1 clambNew2=new ClambNew1(1300,10);
        ClambNew1 clambNew3=new ClambNew1(2000,10);
        Thread p1=new Thread(clambNew1,"猛男");
        Thread p2=new Thread(clambNew2,"年轻人");
        Thread p3=new Thread(clambNew3,"老年人");
        System.out.println("*******开始爬山**********");
        p1.start();
        p2.start();
        p3.start();
    }
}




