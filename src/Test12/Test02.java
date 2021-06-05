package Test12;

public class Test02 {
    public static void main(String[] args) {
        TestStatic02 s1=new TestStatic02();
        TestStatic02 s2=new TestStatic02();
        TestStatic02 s3=new TestStatic02();
        TestStatic02 s4=new TestStatic02();
        //普通属性输出结果都是1
        System.out.println(s1.i);
        System.out.println(s2.i);
        System.out.println(s3.i);
            //静态属性每次加1，输出4次，都为4
        System.out.println(s1.b);
        System.out.println(s2.b);
        System.out.println(s3.b);
        System.out.println(s4.b);

    }
}
