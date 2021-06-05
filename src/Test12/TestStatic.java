package Test12;

public class TestStatic {
    public static void main(String[] args) {
       Static s1=new Static();
       //类只会加载一次
       Static s2=new Static();
    }
}
