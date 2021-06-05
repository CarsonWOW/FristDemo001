package Test11;
//学生类

public class student {
    //发现属性
    public String name="汤川磊";
    public double heavy=67.88;
    public char sex='男';
    public int hight=173;
    public int age=22;
    //发现行为，行为就是方法
    public void study(){
        System.out.println("学习");
    }
    //无参方法
    public int getnum(){
        System.out.println("好好学习");
        return 10;
    }
    //有参方法,调用必须加参数，参数类型是String
    public String getstr(String name1){
        System.out.println("1个参数"+name1);
        return "getstr";
        //2个参数方法

    }
    //两个参数方法
    public String getstr2(String name1,int num){
        System.out.println("这里面有2个参数"+name1);
        return "str"+name1;
    }







}
