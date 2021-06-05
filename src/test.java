public class test {
    public static void main(String[] args) {
        int num[] = {5, 3, 12, 2, 33, 44, 103, 1, 6};
        for (int j = 0; j < num.length; j++) {
            int max = j;//记录最大值的下标
            for (int i=j+1;i<num.length;i++){
                if (num[i]<num[max]){
                    max=i;
                }
            }
            int temp=num[max];
            num[max]=num[j];
            num[j]=temp;

        }
        for (int i=0;i<num.length;i++){
            System.out.println(num[i]+"\t");
        }

    }
}

