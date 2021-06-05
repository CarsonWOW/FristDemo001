package Test25;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符输出流，write 写
 */
public class Test {
    public static void main(String[] args) throws IOException {
        //test01();
        test02();
    }

    private static void test02() throws IOException {
        //1创建字符输出流对象，写
        FileWriter s1=new FileWriter("D:\\JAVA\\jdk-13.0.1\\666\\aa.txt");
        //2.创建数组
        String sc[]={"你们","很牛","得死"};
        //3.循环遍历
        for (String s:sc){
            s1.write(s);
            //每次写了换行
            s1.write("\r");
        }
        //释放资源
        s1.close();
    }

    private static void test01() throws IOException {
        //1创建字符输出流对象，写
        FileWriter f1=new FileWriter("D:\\JAVA\\jdk-13.0.1\\666\\aa.txt",true);
        //2.写，字节流使用的方法，这个字符流就可以使用
        f1.write(97);
        f1.write(98);
        //3.换行，在写
        f1.write("\r");
        f1.write("直接写文字");
        //4.释放资源
        f1.close();
    }
}
