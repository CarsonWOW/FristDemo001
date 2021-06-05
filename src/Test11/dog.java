package Test11;

/**
 * 1.发现类
 * 2，发现属性
 */
public class dog {
    //2.发现属性 public：公共
    public String name = "昵称1";//
    public int healthey = 100;//健康值
    public int love = 100;//与主人亲密度
    public String strain = "品种1";//品种

    //3.发现行为，发现行为就是方法，普通方法
    //void就是返回值 run:方法名 (以后可以传参数）
    public void run() {
        System.out.println("跑呀跑");
    }

    public void slepp() {
        System.out.println("睡呀睡");
    }
    /**
     * void 就是我什么都不返回
     * 定义方法
     * int 返回类型
     */

    public int getNum(){
        System.out.println("今后开发过程中，这里有很多的代码");
        return 10;
    }
    public String getstr(){
        System.out.println("不管你这里面怎么操作的，我就要一个String类型的结果");
        return "好的";
    }

    /**
     *谁调用我，必须给我一个参数，参数类型为String
     * @param name1
     * @return
     */
    public String getstr2(String name1){
        System.out.println("这里面有一个参数"+name1);
        return "getstr2";

    }
    public String getstr3(String name1, int num) {
        System.out.println("这里面有2个参数"+name1);
        return  "str"+name1;
    }


    public static void main(String[] args) {
        //现在要调用dog中的方法或属性
        //步骤：new对象，实例化，创建对象
        dog num = new dog();
        //调用dog当中的属性，通过num(变量名）.属性名即可调用
        System.out.println(num.name);
        System.out.println(num.healthey);
        System.out.println(num.love);
        //调用dog中的方法，通过变量名.方法名（）即可调用
        num.run();


    }
}
