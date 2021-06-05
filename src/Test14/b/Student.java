package Test14.b;
//学生继承了导师
public class Student extends Daoshi {
    public String sname="学生";
    //构造方法
    public Student(){
        super();//这一个就是调用父类的构造方法，还必须是第一位
        System.out.println("这是学生类3");
    }
}
