package Test25;

import java.io.FileWriter;
import java.io.IOException;

/**
 * IO的异常处理
 */
public class Test01 {
    public static void main(String[] args) {
        //调用着不想处理，也不想try
        test01();
    }

    private static void test01() {
        FileWriter s1=null;
        try {
            //1创建字符输出流对象，写
            s1=new FileWriter("D:\\JAVA\\jdk-13.0.1\\666\\aa.txt");
            //2.创建数组
            String sc[]={"你们","很牛","得死"};
            //3.循环遍历
            for (String s:sc){
                s1.write(s);
                //每次写了换行
                s1.write("\r");
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (s1!=null)
                //释放资源
                s1.close();
            }catch (IOException e){

            }

        }

    }
}


