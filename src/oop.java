public class oop {
    public static void main(String[] args) {
        int nums[] = {3, 10, 22, 122, 32, 12};
        for (int i = 0; i < nums.length; i++) {
            int min=i;
            for (int j=i+1;j<nums.length;j++){
                if (nums[j]<nums[min]){
                    j=min;
                }
            }
            int t=nums[min];
            nums[min]=nums[i];
            nums[i]=t;

        }
        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]+"\t");
        }
    }
}