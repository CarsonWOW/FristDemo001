package Test21.b;

public class BuyTicket01 implements Runnable{
    //定义多少张票，数量不是死的
    private int count = 100;//定义总共有多少张票
    private int num = 0;//记录卖出去的票数

    private  boolean flag=true;


    @Override
    public void run() {
        while (flag){
            //调用下面的show方法
            show();
        }

    }

    private void show() {
        synchronized (BuyTicket.class){
            //2.不可能让程序一直死循环
            if (count < 1) {//判断 如果 票数小于1
                //跳出循环,只有为假才跳出循环
                flag=false;

                return;
                //3.每次count需 减一,num需要加一

            }
            count--;
            num++;

            //4.打印输出信息
            System.out.println(Thread.currentThread().getName()+"抢" +
                    "到了第"+num+"张票，还剩"+count+"张票");
        }
    }
}



