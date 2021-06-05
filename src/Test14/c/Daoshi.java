package Test14.c;

public class Daoshi extends Person{
    public String dname="导师";
    //构造方法
    public Daoshi(){
        System.out.println("这是导师2");
    }

    public Daoshi(String dname,String pname) {
        super(pname);
        this.dname = dname;
        System.out.println("这是导师类有参构造方法"+dname);
    }
}
