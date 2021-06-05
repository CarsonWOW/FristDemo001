package Test10.choic;

public class oop {
    public static void main(String[] args) {
        /**
         * 选择排序
         * 原理：从序列中找出最小的那个元素，然后放到前面，并且忽略曾找到的最小元素
         */
        int nums[]={5,13,55,1,4,12,33,77,100,31,105,133};
        //循环下标
        for(int i=0;i<nums.length;i++){
            int min=i;//记录最小值的下标
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[min]){
                    min=j;//记录最小值的下标
                }
            }
            //呼唤位置，将最小的元素放到前面
            int temp=nums[min];
            nums[min]=nums[i];
            nums[i]=temp;

        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+"\t");
        }
    }
}












