package Test29;

public class STRING {
    public static void main(String[] args) {
        /**
         * 统计各个字符出现的个数
         */
        String str[]={"naaaaba"};
        int num=0;
        System.out.println(str.length);
        System.out.println(str[0].codePointCount(0,1));

    }
}
