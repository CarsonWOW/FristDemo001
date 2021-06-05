import java.util.Scanner;

public class nn {
    public static void main(String[] args) {
        String str="abc";
        String str2="abc";
        if (str==str2){
            System.out.println("1");
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入名字：");
        String name=sc.next();
        if (name.equals("abc")){
            System.out.println("1");
        }

    }
}
