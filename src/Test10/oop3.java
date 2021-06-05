package Test10;

public class oop3 {
    //选择排序，从序列中找到最大的数，然后放到后面
    public static void main(String[] args) {
        int nums[]={12,33,7,44,11,5,6,9};
        for (int j=0;j<nums.length;j++){
            int min=j;//记录最小值的下标
            for (int i=1+j;i<nums.length;i++){
                if (nums[i]<nums[min]){
                    min=i;
                }
            }
            int temp=nums[min];
            nums[min]=nums[j];
            nums[j]=temp;
        }
        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]+"\t");
        }

    }
}
