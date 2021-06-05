package Test16.a;

public class Test01 {
    public static void main(String[] args) {
        //创建对象
        UsbInterface usbInterface=new UsbFan();
        usbInterface.service();

        UsbInterface usbInterface1=new UsbDist();
        usbInterface1.service();
    }
}
