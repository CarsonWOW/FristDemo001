package Test13.a;

public class Test13 {
    public static void main(String[] args) {
        //new一个对象，创建对象，实例化
        //创建 狗对象，并调用
        dog num=new dog();
        System.out.println(num.name);
        num.run();
        System.out.println(num.healthey);
        //创建企鹅对象，并调用
        penguin num1=new penguin();
        System.out.println(num1.sex);
        System.out.println(num1.love);
        num1.run();




    }
}
