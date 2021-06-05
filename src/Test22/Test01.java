package Test22;

public class Test01 {
    public static void main(String[] args) {
        Clamb clamb=new Clamb("年轻人",1000,10);
        Clamb clamb1=new Clamb("老年人",1500,10);
        Clamb clamb2=new Clamb("猛男",500,10);
        System.out.println("************开始爬山************");

        clamb.start();
        clamb1.start();
        clamb2.start();
    }
}
