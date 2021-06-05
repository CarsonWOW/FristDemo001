package allday9;

public class Avg {
    public static void main(String[] args) {
        //1．使用数组 计算5位数字平均分   50  90  20  40   10
        int sum=0;//分数总和
        int num[]={50,90,20,40,10};
        for (int i=0;i<num.length;i++){
            sum+=num[i];
        }
        System.out.println("总成绩:"+sum);
        System.out.println("长度:"+num.length);
        System.out.println("平均分:"+sum/num.length);
    }



}
