package allday9;

public class Max {
    public static void main(String[] args) {
        //2．4，7，8，1，60 求出数组中的最大值
        int num[] = {2, 4, 7, 8, 1, 60};
        int max=num[0];
        for (int i=1;i<num.length;i++){
            if (num[i]>num[0]){
                max=num[i];

            }
        }
        System.out.println(max);

    }
}





