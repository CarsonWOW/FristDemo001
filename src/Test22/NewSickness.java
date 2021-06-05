package Test22;

/**
 * 模拟叫号看病
 *  思路：特需号需要加优先级
 */
public class NewSickness implements Runnable{
    private int time;//叫号时间为线程休息时间
    private int num;//病人号

    public NewSickness(int time, int num) {
        this.time = time;
        this.num = num;
    }

    private boolean flag=true;
    @Override
    public void run() {

            sick();
        }



    private synchronized void sick() {
        for (int i=0;i<num;i++){
            System.out.println(Thread.currentThread().getName()+":"+(i+1)+"号客人在看病");
            try {
                Thread.sleep(this.time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class NewSicknessTest{
    public static void main(String[] args) {
        NewSickness newSickness=new NewSickness(1000,5);//特需号,线程休眠时间比普通要少
        NewSickness newSickness1=new NewSickness(1500,15);//普通号
        Thread p1=new Thread(newSickness,"特需号");
        Thread p2=new Thread(newSickness1,"普通号");
        //设置优先级
        p1.setPriority(7);
        p1.start();
        p2.start();
    }
}
