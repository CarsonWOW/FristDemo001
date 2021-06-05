package Test14.c;

public class Student extends Daoshi{
    public String sname="学生";
    //构造方法
    public Student(){
        System.out.println("这是学生3");
    }

    public Student(String dname, String pname, String sname) {
        super(dname, pname);
        this.sname = sname;



    }
}
