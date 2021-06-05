package Test15.a;

public class ColorPrinter extends Pet1 {
    private String name="彩色打印机";

    public String getName() {
        return name;
    }
    public void Print(){
        System.out.println("打印了，打印后为彩色照片");
    }
}
