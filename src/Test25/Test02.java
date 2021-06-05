package Test25;

import java.io.*;

/**
 * 缓冲流
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        test01();
        //test02();
    }
        //通过字节流复制大文件，看需要多长时间
    private static void test02() throws IOException {
        //记录开始时间
        long start=System.currentTimeMillis();//获取当前系统时间

        //1.创建字节输入流，读
        FileInputStream fis=new FileInputStream("路径文件名");
        //2.创建字节输出流，写
        FileOutputStream fos=new FileOutputStream("COPY输入流中的路径文件名");
        //3.定义数组，每次读到多少个字节
        byte[]b=new byte[1];
        int len;//定义长度
        //4.循环读取
        while ((len=fis.read())!=-1){
            //5.写
            fos.write(b,0,len);

        }
        //释放资源
        fis.close();
        fos.close();

        //中间需要进行业务操作，需要时间
        long end=System.currentTimeMillis();//获取当前系统时间
        System.out.println("总共耗时"+(end-start)+"毫秒");

    }

    /**
     * 构造方法
     * public BufferedInputStream(InputStream,in);创建一个新的字节缓冲输入流
     * public BufferedOutputStream(OutputStream,out);创建一个新的字节缓冲输出流
     */

    private static void test01() throws FileNotFoundException {
        //之前学过的字节流创建，输入流
        FileInputStream n=new FileInputStream("D:\\JAVA\\jdk-13.0.1\\666\\aa.txt");
        //创建缓冲字节输入流
        BufferedInputStream s=new BufferedInputStream(n);

        //创建缓冲输出流
        BufferedOutputStream s1=new BufferedOutputStream(new FileOutputStream(""));
    }
}
