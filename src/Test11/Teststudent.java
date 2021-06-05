package Test11;

public class Teststudent {
    public static void main(String[] args) {
        //new对象，实例化，创建对象
        student num=new student();
        System.out.println("学生姓名为："+num.name);
        System.out.println("学生体重为:"+num.heavy);
        System.out.println("学生性别为:"+num.sex);
        System.out.println("学生身高为："+num.hight);
        //行为调用,方法调用
        num.study();
        num.getnum();
        //调用了方法，并接受方法返回的结果
        int num1=num.getnum();
        System.out.println("返回的值为"+num1);
        //有参方法,调用必须加参数，参数类型是String
        num.getstr("汤川磊");
        //2个参数方法，调用必须加2个参数，一个是Sting,一个是int
        num.getstr2("汤川磊",1);
        //也可直接调用方法
        System.out.println(num.getnum());



    }
}
