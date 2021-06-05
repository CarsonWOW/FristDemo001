package allday9;

public class Test01 {

    public static void main(String[] args) {
        //求1-10之间的整数相加，得到累加值大于20的当前数，并打印
        int sum=0;
        for(int i=1;i<=10;i++){
            sum+=i;//累计相加公式
            if(sum>20){
                System.out.println("当前数为："+i);
                break;
            }
        }
    }
}






