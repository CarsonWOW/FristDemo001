package Test23;

public class Test01 {
    public static void main(String[] args) {
        //求1到100数之和 递归
       int num=sum(100);




        Test01 test01=new Test01();
        System.out.println("1到100的和为"+test01.count1);
        System.out.println(num);
    }

    private static int sum(int i) {
        if(i>0){
            return i+sum(i-1);
        }else {
            return 0;
        }
    }



    //求1到100的和
    int count1=getCount(100);

    private static int getCount(int i) {
            int count=0;
            for (int j=1;j<=i;j++)
                count+=j;
            return count;

    }






}


