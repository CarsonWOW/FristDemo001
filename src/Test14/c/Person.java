package Test14.c;

public class Person {
    public String pname="人类";
    //构造方法
    public Person(){
        System.out.println("这是人类1");
    }

    public Person(String pname) {
        System.out.println("这是人类有参构造方法"+pname);
        this.pname = pname;
    }
}
