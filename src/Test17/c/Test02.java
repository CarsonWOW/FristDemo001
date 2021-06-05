package Test17.c;

import Test17.c.A4Paper;
import Test17.c.Paper;
import Test17.c.Print;
import Test17.c.RedIntBox;

public class Test02 {
    public static void main(String[] args) {
        System.out.println("我要使用彩色墨盒在A4纸上打印");
        RedIntBox redIntBox=new RedIntBox();
        Paper paper=new A4Paper();
        Print print=new Print();
        //将彩色墨盒 A4纸 set到Print
        print.setIntBox(redIntBox);
        print.setPaper(paper);
        //打印
        print.Print();



    }
}
