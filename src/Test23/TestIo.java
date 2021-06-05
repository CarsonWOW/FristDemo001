package Test23;

import java.io.File;
import java.io.IOException;

public class TestIo {
    public static void main(String[] args) throws IOException {
        //这是一个方法，方法还没有定义
        //test();
        //test01();
        //test02();
        test03();
    }

    /**
     * 目录的遍历
     * public String[] list(); 返回一个String数组，表示该File目录中的所有子文件或目录
     * public File[] listFiles() 返回一个File数组，表示该File目录中的所有的子文件或目录
     */

    private static void test03() {
        File file=new File("D:\\JAVA\\jdk-13.0.1\\");
          String sc[]=file.list();
          //循环遍历,返回的是相对路径
        for (String s:sc){
            System.out.println(s);

        }
        //获取绝对路径目录下的文件以及目录
       File file1[]= file.listFiles();
        for(File s:file1){
            System.out.println(s);//返回的是绝对路径
        }

    }

    /**
     * public boolean createNewFile() 当且仅当具有该名称的文件尚不存在时，创建一个新的空文件
     * public boolean delete()  删除由此File表示的文件或目录
     * public boolean mkdir() 创建由此File表示的目录 这一个只会创建一个，一般不用
     * public boolean mkdirs()  创建由此File表示的目录，包括任何必需但不存在的父目录
     *
     */

    private static void test02() throws IOException {
        File file3=new File("D:\\JAVA\\jdk-13.0.1\\aab\\C\\CC");
        System.out.println(file3.exists());//如果不存在输出的是false
        //1.判断是否存在  也包括目录
       /* if(!file3.exists()){
            System.out.println("不存在");
            //这个方法只是创建文件，不是创建目录

            //创建目录
            file3.mkdirs();
            System.out.println("文件夹创建成功");

        }else {
            file3.delete();
        }*/
        if(!file3.exists()){
            //这个方法只是创建文件，不是创建目录
             file3.createNewFile();
            System.out.println("文件创建成功");
        }else {
            file3.delete();
            System.out.println("文件删除");
        }
    }




    /**
     * public boolean exists(),此File表示的文件或目录是否 实际存在
     * public boolean isDirectory(),此File表示的是否为目录
     * public boolean isFile(),此File表示的是否为文件
     */


    private static void test01() {
        File file=new File("D:\\JAVA\\jdk-13.0.1\\123.txt");
        File file1=new File("D:\\JAVA\\jdk-13.0.1");
        System.out.println("文件或目录是否存在"+file.exists()); //不存在返回false
        System.out.println("文件是不是目录"+file1.isDirectory());
        System.out.println("是不是文件"+file.isFile());
        System.out.println("是不是文件"+file1.isFile());
    }

    /**
     *  public String getAbsolutePath() 返回此抽象路径名的绝对路径名字符串
     *  public String getPath() 将此File转换为路径名字符串
     *  public String getName() 返回由此抽象路径名表示的文件或目录的名称
     *  public long length() 返回由此File表示的文件的长度
     */

    private static void test() {
        //String getAbsolutePath() 返回此抽象路径名的绝对路径名字符串
        File file=new File("D:\\JAVA\\jdk-13.0.1\\123.txt");
        System.out.println("绝对路径名字字符串为："+file.getAbsolutePath()
       );
        System.out.println("将此File转换为路径名字符串"+file.getPath());
        System.out.println("返回由此抽象路径名表示的文件或目录的名称"+file.getName());
        System.out.println("返回由此File表示的文件的长度为"+file.length());
    }
}
