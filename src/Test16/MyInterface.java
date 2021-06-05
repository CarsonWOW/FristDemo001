package Test16;

/**
 * describe 定义接口，把之前的class改为interface
 * 1.接口不可以new对象
 * 2.接口中只能有抽象方法，没有具体实现
 * 3.接口中的属性都是静态常量
 * 4.实现类可以实现多个接口（JAVA中的多继承）
 * 5.接口中的所有方法实现类必须全部实现（因为所有方法都为抽象方法）
 */
public interface  MyInterface {
    //2.接口中只能有抽象方法，没有具体实现

    /**
     * 定义抽象方法
     * 今后开发过程中，大家看到的所有接口中的方法都是这样  public void addUser();
     */
    //定义抽象方法
    public void addUser();

    //如果你不加 public abstract,系统默认给你加上
    abstract int deleteUser(int id);

    //静态常量
    public static final int MAX_ID=100;
    //如果你不写public static final，系统默认加上

    int MIN_ID=10;
}
