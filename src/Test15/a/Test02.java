package Test15.a;

public class Test02 {
    public static void main(String[] args) {
        Master01 master01=new Master01();
        Blackandwhiteprinter blackandwhiteprinter=new Blackandwhiteprinter();
        //使用黑白打印机
        master01.print(blackandwhiteprinter);

        //使用彩色打印机
        ColorPrinter colorPrinter=new ColorPrinter();
        master01.print(colorPrinter);

    }
}
