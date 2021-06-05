package allday9;

import Test15.a.b.Master;

public class MaoPao1 {
    public static void main(String[] args) {
        int num[] = {3, 5, 1, 12, 55, 33, 22, 156};
       /* for (int i=1;i<num.length-1;i++){
            for (int j=1;j<i+1;j++){
                if (num[j-1]>num[j]){
                    int t=num[j];
                    num[j]=num[j-1];
                    num[j-1]=t;
                }
            }
        }
        for (int i=0;i<num.length;i++){
            System.out.println(num[i]+"\t");
        }

    }*/
        for (int i = 0; i < num.length; i++) {
            int max = i;
            for (int j = i + 1; j < num.length; j++) {
                if (num[j] > num[max]) {
                    max = j;
                }
            }
            int temp = num[max];
            num[max]=num[i];
            num[i] = temp;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + "\t");
        }
    }
}
