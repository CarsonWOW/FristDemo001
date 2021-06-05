package Test10;

public class oop01 {
    public static void main(String[] args) {
        //排序
        int nums[] = {5, 2};
        int temp=nums[1];//2拿出来
        nums[1]=nums[0];//2和5呼唤位置
        nums[0]=temp;
        for (int i=1;i<nums.length;i++){
            System.out.print(nums[i]);
        }




        /*int num1[] = {2, 5, 1, 9, 6};//对这个数组进行排序
        for (int end = num1.length - 1; end > 0; end--) {
            for (int i = 1; i < end + 1; i++) {
                if (num1[i - 1] > num1[i]) {//2>5 成立，换下一个相领的数进行比较排序，5>1,5大，1取出来，放到5这里
                    int temp1 = num1[i - 1];//不能使用0
                    num1[i - 1] = num1[i];
                    num1[i] = temp1;

                }

            }
            for (int i = 0; i < num1.length; i++) {
                System.out.print(num1[i] + "\t");
            }


        }*/
    }
}
