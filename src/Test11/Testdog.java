package Test11;

public class Testdog {
    public static void main(String[] args) {
        //现在要调用dog中的方法或属性
        //步骤：new对象，实例化，创建对象
        dog num=new dog();
        //调用dog当中的属性，通过num(变量名）.属性名即可调用
        System.out.println(num.name);
        System.out.println(num.healthey);
        System.out.println(num.love);
        //调用dog中的方法，通过变量名.方法名（）即可调用
        num.run();
        //如果要修改属性的值，通过变量名.属性名="你的值"
        num.name="旺财";
        System.out.println(num.name);
        new dog().getNum();

    }
}
