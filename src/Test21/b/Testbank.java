package Test21.b;

public class Testbank {
    public static void main(String[] args) {
        //创建对象
        Bank bank=new Bank();
        //创建线程
        Thread t1=new Thread(bank,"张三");
        Thread t2=new Thread(bank,"李四");
        Thread t3=new Thread(bank,"123");
        //启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}
