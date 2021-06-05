package Test10;

public class oop2 {
    public static void main(String[] args) {
        /**
         * 冒泡排序
         * 比较相邻的两个元素，将最大的值交换到最右边
         */
        int nums[] = {5, 2, 13, 22, 55, 16, 32, 25, 53, 77, 103, 202};
        for (int i = 1; i < nums.length - 1; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "\t");
        }
        /**
         * 选择排序
         * 记录最小值的下标，将最小值放到左边
         */
        for (int i = 0; i < nums.length - 1; i++) {
            int max=i;//记录最大值的下标
            for (int j=i+1;j<i+1;j++){
                if (nums[j]>nums[max]){
                    j=max;
                }
            }
            int temp=nums[max];
            nums[max]=nums[i];
            nums[i]=temp;

        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "\t");
        }
    }
}
