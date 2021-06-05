package allday9;

public class work9 {
    public static void main(String[] args) {
        //2,4,7,8,1,60,求出数组中的最大值
      int num[]={2,4,7,8,1,60};
      //
      int max=num[0];
      for (int i=1;i<num.length;i++){
          if (num[i]>max){
              max=num[i];
          }

      } System.out.println("最大："+max);



        //求最小值
       /* int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]<min){
                nums[i]=min;
            }

        }
        System.out.println("最小值为："+min);
    }*/
    }
}
