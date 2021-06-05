package allday9;

import java.util.Scanner;

public class work5 {
    public static void main(String[] args) {
        //如果体彩中了500万，就去买房，资助希望工程，去欧洲旅游，如果没中，就买下一期体彩，继续烧高香
        Scanner Num = new Scanner(System.in);

        System.out.println("你是否中了500万？是就输入1,没有就输入2");

        int ggg = Num.nextInt();
        //中了
        if (ggg == 1) {
            System.out.println("买房，资助工程，旅游");
        } else {
            System.out.println("买下一期体彩，继续烧高香");

        }

    }

    }






