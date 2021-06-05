package Test21.b;

/**
 * 模拟网络购票
 * 通过线程同时访问共享数据会引发线程安全问题
 * 如何解决
 * 解决第一种方式
 */
public class BuyTicket implements Runnable {
    //定义多少张票，数量不是死的
    private int count = 100;//定义总共有多少张票
    private int num = 0;//记录卖出去的票数

    @Override
    public void run() {
        //1.票数我门是不知道到底有多少
        while (true) {//死循环

            //同步代码，加一个锁
            synchronized (BuyTicket01.class){
                //2.不可能让程序一直死循环
                if (count < 1) {//判断 如果 票数小于1
                    //跳出循环

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
}