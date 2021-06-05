package Test29;

public class danda {
    public static void Paixu(int num[]){
        for (int i=1;i<num.length;i++){
            for(int j=1;j<num.length;j++){
                if (num[j-1]>num[j]){
                    int temp=num[j-1];
                    num[j-1]=num[j];
                    num[j]=temp;
                }
            }
        }
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+"\t");
        }

    }
    public static void main(String[] args) {
        int num[]={3,4,1,33,100,2,17,27};
        Paixu(num);
    }
       /* int num[] = {13, 2, 1, 33, 5, 66, 4};
        for (int i=1;i<num.length;i++){
            for(int j=1;j<num.length;j++){
                if (num[j-1]>num[j]){
                    int temp=num[j-1];
                    num[j-1]=num[j];
                    num[j]=temp;

                }
            }
        }
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+"\t");
        }

    }*/
}
