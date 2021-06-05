package Test21.b;

public class Bank implements Runnable {
    private int num = 20;//一共有多少个号
    private boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            //调用方法
            show();
        }
    }

    private void show() {
        synchronized (Bank.class) {
            if (num < 1) {
                flag=false;
                return;
            }
            num--;
            System.out.println("请"+Thread.currentThread().getName()+"到第"+num+"号排队取钱");
        }
    }
}









