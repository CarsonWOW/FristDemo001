package Test23;

public class Digui {
    public static void main(String[] args) {
        //求1到100数之和 递归
        int count=getSum(5);
        System.out.println(count);
        //1*2*3*4*5 的值
        int count2=getSum2 (5);
        System.out.println(count2);
    }

    private static int getSum2(int num) {
        if(num==1){
            return 1;
        }
        return num*getSum2(num-1);
    }


    private static int getSum(int num) {
        //需要保证能停下来
        if(num==1){
                return 1;
        }
        return num+getSum(num-1);
    }

}

