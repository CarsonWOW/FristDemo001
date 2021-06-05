package Test25;

import java.io.*;

/**
 * 字符缓冲流
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
       // test01();
       // test02();
       // test03();
        test04();

    }

    private static void test04() throws IOException {
        //1.创建字符缓冲流，输出流，写
        BufferedWriter s1=new BufferedWriter(new FileWriter("D:\\JAVA\\jdk-13.0.1\\666\\aa.txt"));
        //写数据
        s1.write("我很牛");
        //换行
        s1.newLine();
        s1.write("你们晓得不");
        s1.close();

    }

    private static void test03() throws IOException {
        //1.创建字符缓冲流，输入流，读
        FileReader s=new FileReader("D:\\JAVA\\jdk-13.0.1\\666\\aa.txt");
        BufferedReader s1=new BufferedReader(s);
        //2.定义一个字符串，保存每次读到的行
        String LineStr=null;
       // LineStr=s1.readLine();
        //3.循环遍历
        while ((LineStr=s1.readLine())!=null){
            System.out.println(LineStr);

        }
        s1.close();
    }

    /**
     *创建字符缓冲流，输入流，读，特有的方法，以前字符特有的方法，它都可以使用
     * 一次可以读一行
     * @throws IOException
     */
    private static void test02() throws IOException {
        //1.创建字符缓冲流，输入流，读
        FileReader s=new FileReader("D:\\JAVA\\jdk-13.0.1\\666\\aa.txt");
        BufferedReader s1=new BufferedReader(s);
        //2.以前每次一个一个读，现在一行一行读,读到最后没有返回null
        System.out.println(s1.readLine());
        System.out.println(s1.readLine());

        s1.close();
    }



    private static void test01() throws IOException {
        //创建字符流，读
        FileReader s=new FileReader("D:\\JAVA\\jdk-13.0.1\\666\\aa.txt");
        //创建字符缓冲流，输入，读
        BufferedReader s1=new BufferedReader(s);
        //创建字符缓冲流，输出，写
        BufferedWriter s2=new BufferedWriter(new FileWriter("D:\\JAVA\\jdk-13.0.1\\666\\aa.txt"));
    }
}
