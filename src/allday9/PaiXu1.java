package allday9;

import java.awt.font.FontRenderContext;

public class PaiXu1 {
    public static void main(String[] args) {
        int nums[]={12,5,1,22,33,103,766,88};
        for (int i=0;i<nums.length;i++){
            int min=i;
            for (int j=i+1;j<nums.length;j++){
                if (nums[j]<nums[min]){
                    min=j;
                }
            }
            int temp=nums[min];
            nums[min]=nums[i];
            nums[i]=temp;
        }
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+"\t");
        }
        System.out.println("**********");
        /**
         * 冒泡
         */
        for (int i=1;i<nums.length-1;i++){
            for (int j=1;j<i+1;j++){
                if (nums[j-1]>nums[j]){
                    int temp=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+"\t");
        }
    }
}
