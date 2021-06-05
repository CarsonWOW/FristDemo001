package Test21.b;

/**
 * 创建线程的第二种方式，
 * 1.实现runnable接口
 * 2.实现run方法
 *
 */

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i= 0;i<3;i++){
            System.out.println("线程名为"+Thread.currentThread().getName());

        }



    }
}
