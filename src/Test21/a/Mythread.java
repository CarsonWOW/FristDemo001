package Test21.a;

/**
 * 1创建继承Thread类
 * 2重写run()方法
 */
public class Mythread  extends Thread{
    @Override
    public void run() {
        //循环遍历100内的偶数
        for (int i=0;i<100;i++){
            if (i%2==0){//i%2:i除以2的余数
                System.out.println(i);
            }
        }
    }
}
//创建测试类
class  MythredTest{
    public static void main(String[] args) {
        //创建线程
        Mythread p1=new Mythread();
        Mythread p2=new Mythread();
        //启动线程，通过此对象调用start()
        p1.start();
        //线程名
        System.out.println("线程名为"+p1.getName());
        //修改线程名
        p1.setName("修改的");
        //在获取线程名
        System.out.println(p1.getName());

    }
}
