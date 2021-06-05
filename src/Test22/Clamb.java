package Test22;

/**
 * 模拟多人爬山
 */
public class Clamb extends Thread{
    private int time;///爬100米时长
    private int num;//爬了多少个100米

    public Clamb(String name,int time, int num) {
        super(name);
        this.time = time;
        this.num = num;
    }

    @Override
    public void run() {
        //当爬了第1个100时，开始循环
        while (num>0){
            //休眠为爬100米的时长
            try {
                Thread.sleep(this.time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "爬完100米！");
            //爬完后跳出循环
            num--;
        }
        //循环完后，输出打印到达终点
        System.out.println(Thread.currentThread().getName()+"到达终点！");

    }
}
