package Test22;

/**
 * 模拟多人爬山
 * 思路：
 * 爬完100米休息时间为休眠时间
 * 不同的人休息时间不同
 */
public class Clamb01 implements Runnable {
    private int time;//爬了100米的休息时间
    private int num;//爬了多少个100米

    public Clamb01(int time, int num) {
        this.time = time;
        this.num = num;
    }
    @Override
    public void run() {
        while (num>0){
            //休眠时间为爬100米的休息时间
            try {
                Thread.sleep(this.time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"爬了100米");
            num--;
            if(num==0){
                System.out.println(Thread.currentThread().getName()+"爬完了");
                return;
            }

        }
    }
}

