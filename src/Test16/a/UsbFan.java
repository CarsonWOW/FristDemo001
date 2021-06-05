package Test16.a;

/**
 * Usb风扇实现Usb接口
 */
public class UsbFan implements UsbInterface {
    @Override
    public void service() {
        System.out.println("连接上了USB,风扇开始动了");

    }
}
