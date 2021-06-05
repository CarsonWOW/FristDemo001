package Test14.e;

/**
 * 如果继承了抽象类 有两种方式
 * 1，自己修改为抽象类
 * 2.实现父类的所有抽象方法
 */
//public abstract class  Test01 extends Abstract {
public  class  Test01 extends Abstract {
    public void deleteUser(){
        System.out.println("重写父类方法");

    }
}
