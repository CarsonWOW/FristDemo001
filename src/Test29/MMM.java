package Test29;

public class MMM {
    public static void main(String[] args) {
        //编写一个java程序在屏幕上输出1!+2!+3!+....+10的和
        //!为阶乘,比如4的阶乘是1*2*3*4
        int a=1;
        int count=0;
        for (int num=1;num<=10;num++){
            count+=a;
            a=a*(num+1);
        }
        System.out.println(count);
    }
}
