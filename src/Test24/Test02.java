package Test24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 字符流 输入流 读取数据
 *
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        test01();
    }

    private static void test01() throws IOException {
        FileReader fr=new FileReader("D:\\JAVA\\jdk-13.0.1\\666\\aa.txt");
      //  fr.read();//每次读取一个字符

        int len;//定义长度
        //2.循环遍历
        while ((len=fr.read())!=-1){
            System.out.print((char)len);
        }
        //3.释放资源
        fr.close();
    }
}
