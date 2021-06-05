package allday9;

public class MaoPao {
    public static void main(String[] args) {

        int num[] = {2, 4, 7, 8, 1, 60};
        for (int i=1;i<num.length-1;i++){
            for (int j=1;j<num.length;j++){
                if (num[j-1]>num[j]){
                    int temp=num[j-1];
                    num[j-1]=num[j];
                    num[j]=temp;
                }
            }
        }
        for (int j=0;j<num.length;j++){
            System.out.print(num[j]+"\t");
        }
    }
}
