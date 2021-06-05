package Test13;
//子类
public class computer1 extends pet {
    //发现属性

    public String colour="黑色";//电脑颜色
    //重写父类
    //假设，手机很贵买不起，电脑有了不用买

    public void getA(){
        //super,父类的意思
        super.getA();
        System.out.println("但电脑有了不用买");
        super.getA();
    }
}
