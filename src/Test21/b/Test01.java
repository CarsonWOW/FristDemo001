package Test21.b;

public class Test01 {
    public static void main(String[] args) {
        //1.创建对象
        BuyTicket01 buyTicket=new BuyTicket01();
        //2.创建线程对象，然后把BuyTicket参数传递给线程
        Thread t1=new Thread(buyTicket,"个人");
        Thread t2=new Thread(buyTicket,"黄牛");
        Thread t3=new Thread(buyTicket,"网络");

        //3.启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}
