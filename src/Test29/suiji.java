package Test29;

import java.util.Random;

public class suiji {
    public static String getA(){
        StringBuilder stringBuilder=new StringBuilder();
        Random random=new Random();
        for (int i=0;i<6;i++){
            stringBuilder.append(random.nextInt(10));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(suiji.getA());
    }
}

