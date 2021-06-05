package Test23;

import java.io.File;

public class Test03 {
    public static void main(String[] args) {
        File file = new File("D:\\JAVA\\jdk-13.0.1\\");

        //通过递归实现打印多级目录
        printdir(file);

        //需求，去目录里面下面找一个后缀名为.java的文件
        printdir1(file);
    }

    private static void printdir1(File file) {
    }

    private static void printdir(File file) {
        File file1[] = file.listFiles();
        for (File s : file1)
            //目前只是把java jdk这里面打印输出了
            System.out.println(s);

        /*if (file.isFile()) {//判断是不是文件
            System.out.println(file);
        }else {//不是文件
            System.out.println(file);
            printdir(file);
        }*/
    }
}
