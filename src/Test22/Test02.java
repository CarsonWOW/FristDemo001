package Test22;

public class Test02 {
    public static void main(String[] args) {
        Clamb01 clamb01=new Clamb01(1000,3);
        Clamb01 clamb02=new Clamb01(1500,3);
        Clamb01 clamb03=new Clamb01(800,3);

        Thread p1=new Thread(clamb01,"年轻人");
        Thread p2=new Thread(clamb02,"老年人");
        Thread p3=new Thread(clamb03,"体育生");
        System.out.println("*************开始爬山*************");
        p1.start();
        p2.start();
        p3.start();
    }
}
