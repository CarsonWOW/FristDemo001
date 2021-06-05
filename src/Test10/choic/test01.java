package Test10.choic;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        /**
         * 取一个1-100的数字
         * 遇到3的倍数输出麦
         * 遇到5的倍数输出叔
         * 遇到即是3的倍数又是5的倍数，输出麦叔
         * 如果都不是，输出那个数字本身
         */
        //Scanner sc=new Scanner(System.in);
        //System.out.println("请输入一个1到100的整数：");
        //int num=sc.nextInt();
        //if(num%3==0 && num%5!=0){
          //  System.out.println("麦");
        //}else if(num%5==0 && num%3!=0){
            System.out.println("叔");
        //}else if(num%3==0 && num%5==0){
            System.out.println("麦叔");
        //}else {
          //  System.out.println(num);
        //}
            Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个1到100的整数：");
        int num=sc.nextInt();
        for(int i=1;i<100;i++){
            if(num%3==0 && num%5!=0 ){
                System.out.println("麦");
                break;
            }else if(num%5==0 && num%3!=0){
                System.out.println("叔");
                break;
            }else if(num%3==0 && num%5==0){
                System.out.println("麦叔");
                break;
            }else {
                System.out.println(num);
                break;
            }
        }



    }

}
