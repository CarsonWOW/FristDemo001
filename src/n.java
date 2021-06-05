import java.util.Scanner;

public class n {
    public static void main(String[] args) {
        double num[]=new double[4];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<num.length;i++){
            System.out.println("请输入第"+(i+1)+"店的价格");
            double pirce=sc.nextDouble();
            //存入数组
            num[i]=pirce;

            }
        //最小值
        double min=num[0];
        //最大值
        double max=num[0];
        for (int i=0;i<num.length;i++){
            if (num[i]<min){
                min=num[i];
            }
            if(num[i]>num[0]){
                max=num[i];
            }
        }
        System.out.println("最小值"+min);
        System.out.println("最大值"+max);


    }
}








