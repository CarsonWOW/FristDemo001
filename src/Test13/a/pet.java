package Test13.a;

/**
 * pet 父类
 * 父类
 * 1.把相同的代码，全部抽取到父类
 * 2.在子类 写上 extends pet
 * 3.继承修饰符，后面讲
 *
 */
public class pet {
    public String name="小狗";//
    public int healthey =100;//健康值
    public int love =0;//与主人亲密度
    public void run(){
        System.out.println("跑呀跑");
    }
}
