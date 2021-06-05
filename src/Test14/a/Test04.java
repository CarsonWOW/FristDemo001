package Test14.a;

//继承了Test01
public class Test04 extends Test01 {
    public static void main(String[] args) {
        Test04 T1=new Test04();
        /*System.out.println(T1.name1);
        System.out.println(T1.name2);*/
        //子类可以访问protected，和public
        System.out.println(T1.name3);
        System.out.println(T1.name4);

    }
}
