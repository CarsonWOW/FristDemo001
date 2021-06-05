package Test12;
//手机类

public class phone {
    //普通属性
    public String name;//手机名字
    public int money;//手机价格
    public String operating;//操作系统
    public int num;//手机编号
    //构造方法，无参构造方法，无返回值,方法名必须与类名一致，并且再new对象前就已经被调用了
    public phone(){
        System.out.println("内存为8G");
    }
    //有参构造方法
    public phone(String name){
        System.out.println("快来买");
    }
    public phone(int num,String name){
        System.out.println("数量为："+num+"部"+name);
    }
    public phone(String operating,int money,String name){
        System.out.println("型号是:"+operating+",价格是:"+money+",名字是:"+name);
    }
    /**
     * 构造方法重载
     * 作用：调用同一个方法
     * 1.普通方法也重载，构造方法也可以重载
     * 2.与返回值无关 3.方法名必须相同，才能叫重载 4.与修饰符无关 5.参数列表个数不同，或参数类型不同，与变量名
     * 无任何关系
     */
    //比如
    public phone(int num,String name,int a,int c){
        //这2个构造方法可以重载，因为参数列表不同，或参数类型也不同
    }
    public phone(String name,int a,int c){

    }
    //通过构造方法去赋值
    public phone(String name,int money,String operating ,int num){
        System.out.println("手机名字是"+name+",一部手机的价钱是"+money+",操作系统是"+operating+",数量为"+num);
        this.money=4999;
        this.name="华为";
        this.operating="安卓系统";
        this.num=100;

    }


}
