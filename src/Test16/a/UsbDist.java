package Test16.a;

/**
 * USB硬盘实现接口
 */
public class UsbDist implements UsbInterface{
    @Override
    public void service() {
        System.out.println("连接USB   开始传输数据");
    }
}
