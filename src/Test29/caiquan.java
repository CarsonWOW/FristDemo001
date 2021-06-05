package Test29;

public class caiquan {
    public static void main(String[] args) {
        int nums[]={3,1,12,33,44,21,42,225,78,2};
        /**冒泡
         * 冒泡排序
         * 相邻的2个元素比较大小，并进行位置调换
         */
        for (int j=1;j<nums.length-1;j++){
            for (int i=1;i<nums.length;i++){
                if (nums[i-1]>nums[i]){//相邻2个数比较
                    int temp=nums[i];
                    nums[i]=nums[i-1];
                    nums[i-1]=temp;

                }
            }
        }
        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]+"\t");
        }
        System.out.println("*******************************");
        /**\
         * 选择排序
         * 找出最大或最小的那个数，放到后面或最前面
         */
        int nums1[]={5,8,321,33,44,21,42,225,78,2};
        for (int g=0;g<nums1.length;g++){
            int max=g;//记录最大值的下标
        }





    }
          }



