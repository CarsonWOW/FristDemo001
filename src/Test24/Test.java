package Test24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * OutputStream() 字节输出流 就是写
 */
public class Test {
    public static void main(String[] args) throws IOException {
            //test01();
        //test02();
        //test03();
        //test04();
        //test05();
        test06();
    }
//写如数据并换行
    private static void test06() throws IOException {
        //每次写完后会把之前的删除了,就加一个路径最后加个true,每次值不覆盖
        //1.创建字节输出流对象，就是写
        FileOutputStream s1=new FileOutputStream("D:\\JAVA\\jdk-13.0.1\\666\\aa.txt",true);
        byte b[]={97,98,99};
        //2.把字符串转为字符数组
        for (int i=0;i<b.length;i++){
            s1.write(b[i]);//每次写一个
            //写完后就换行，以后不会这样写
            s1.write("\r".getBytes());
        }


        //4.关闭流
        s1.close();

    }

    private static void test05() throws IOException {
        //每次写完后会把之前的删除了,就加一个路径最后加个true,每次值不覆盖
        //1.创建字节输出流对象，就是写
        FileOutputStream s1=new FileOutputStream("D:\\JAVA\\jdk-13.0.1\\666\\aa.txt",true);
        //2.把字符串转为字符数组
        byte[] c="很牛".getBytes();

        //如果把字符串全部写进去
        s1.write(c,0,c.length);

        //4.关闭流
        s1.close();


    }

    private static void test04() throws IOException {
        //1.创建字节输出流对象，就是写
        FileOutputStream s1=new FileOutputStream("D:\\JAVA\\jdk-13.0.1\\666\\aa.txt");
        //2.把字符串转为字符数组
        byte[] c="abcdefg".getBytes();
        //3.写 write(byte[] b,int off：从索引几开始彼此,int len:总共写几个 )
        //s1.write(c,3,2);//（变量名，从索引几开始，从索引后面写几个）

        //如果把字符串全部写进去
        s1.write(c,0,c.length);
        
        //每次写完后会把之前的删除了
        //4.关闭流
        s1.close();
    }




    private static void test03() throws IOException {
        //1.创建字节输出流对象，就是写
        FileOutputStream s1=new FileOutputStream("D:\\JAVA\\jdk-13.0.1\\666\\aa.txt");
        //2.把字符串转为字符数组
        byte[] b="汤川磊在学IO".getBytes();
        //3.写
        s1.write(b);
        //4.关闭流
        s1.close();
    }

    private static void test02() throws IOException {
        //1.创建字节输出流对象，就是写
        FileOutputStream s1=new FileOutputStream("D:\\JAVA\\jdk-13.0.1\\666\\aa.txt");
        //2.写write(int b)将指定字节写入此文件输出流
        s1.write(97);//写第一个字符 a
        s1.write(98);//写第2字符 b
        s1.write(99);//写第3个字符 C
        s1.write(100);//写第4个字符 d
        //3.必须关闭输出流
        s1.close();

    }

    private static void test01() throws FileNotFoundException {
        //创建字节输出流对象，就是写
        FileOutputStream fos=new FileOutputStream("D:\\JAVA\\jdk-13.0.1\\666.txt");

        File file=new File("D:\\JAVA\\jdk-13.0.1\\66.txt");
        FileOutputStream fos1=new FileOutputStream(file);
        
    }
}
