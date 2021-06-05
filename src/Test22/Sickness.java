package Test22;

/**
 * 模拟叫号看病
 * 思路：特需号需要加优先级
 */
public class Sickness implements Runnable {
    private int time;//每次叫号的时间
    private int num;//病人号

    public Sickness(int time, int num) {
        this.time = time;
        this.num = num;
    }

    @Override
    public void run() {

        for (int i=0;i<num;i++){
            //休眠时间为每次叫号的时间
            try {
                Thread.sleep(this.time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":"+(i+1)+"号客人在看病");
        }

    }
}
