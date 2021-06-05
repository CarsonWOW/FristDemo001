package Test24;

import java.io.*;

/**
 * InputStream 输入流  读
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
            //test01();
            //test02();
           // test03();
            test04();
    }
        //通过IO字节流复制文件，什么类型的文件都可以
    private static void test04() throws IOException {
        //1.创建输入流，用来读取数据
        FileInputStream fis=new FileInputStream("D:\\JAVA\\jdk-13.0.1\\02.jpg");
        //2.创建输出流，用来写数据
        FileOutputStream fos=new FileOutputStream("D:\\JAVA\\jdk-13.0.1\\copy02.jpg");

        int len=0;//定义长度
        //定义数组
        byte[]b=new byte[1024];
        //3.循环遍历
        while ((len=fis.read(b))!=-1){
            //写
            fos.write(b,0,len);
        }
        //4.释放资源
        fos.close();
        fis.close();

    }

    private static void test03() throws IOException {
        //1.创建字节输入输入流对象，读
        FileInputStream fis=new FileInputStream("D:\\JAVA\\jdk-13.0.1\\666\\aa.txt");
        //2.定义变量
        int len;
        byte[]b=new byte[2];
        //3.循环遍历
        while ((len=fis.read(b))!=-1){
            //每次读到后，把数组变成字符串
            System.out.print(new String(b,0,len));
        }
        //4.关闭流
        fis.close();
    }

    private static void test02() throws IOException {
        //1.创建字节输入输入流对象，读
        FileInputStream fis=new FileInputStream("D:\\JAVA\\jdk-13.0.1\\666\\aa.txt");
        //2.定义变量
        int b;
        //b=fis.read()          b=fis.read()!=-1
        //3.循环遍历
        while ((b=fis.read())!=-1){
            System.out.print((char)b);
        }
        //4.关闭流
        fis.close();


    }

    private static void test01() throws IOException {
        //1.创建字节输入输入流对象，读
        FileInputStream fis=new FileInputStream("D:\\JAVA\\jdk-13.0.1\\666\\aa.txt");
        //2.读取数据
        int read=fis.read();//每次读一个字节
        System.out.println((char)read);

        read=fis.read();//每次读一个字节
        System.out.println((char)read);

         read=fis.read();//每次读一个字节
        System.out.println((char)read);

         read=fis.read();//每次读一个字节
        System.out.println((char)read);

        read=fis.read();//每次读一个字节
        System.out.println((char)read);

        //3.关闭流
        fis.close();
    }
}
