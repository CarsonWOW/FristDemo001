package Test22;

public class Test03 {
    public static void main(String[] args) {
        Sickness sickness=new Sickness(1000,6);
        Sickness sickness1=new Sickness(1500,10);
        Thread p1=new Thread(sickness,"特需号");
        Thread p2=new Thread(sickness1,"普通号");
        System.out.println("**********看病叫号中**********");
        //设置优先级，让特需号可能优先
        p1.setPriority(7);
        p1.start();
        p2.start();
    }
}
