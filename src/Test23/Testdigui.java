package Test23;

/**
 *递归分类
 * 递归分为两种，直接递归和间接递归
 * 直接递归：就是自己调用自己
 * 间接递归：a方法调用b方法，b方法调用c方法，c方法调用a方法
 * 注意事项
 * 递归一定要有条件限制，保证递归能停止下来，否则会发生栈内存溢出
 * 在递归中虽然有限定条件，但是递归次数也不能太多，否则也会发生栈内存溢出
 * 构造方法：禁止递归
 *
 */
public class Testdigui {
    public static void main(String[] args) {
       // a();
        bbb(1);
    }

    private static void bbb(int i) {
        System.out.println("i的值为："+i);
        //添加判断，设定条件，保证递归能停止下来
        if(i==500){
            // 如果i的值为500，则结束
            return;
        }
        bbb(++i);
    }

    private static void a() {
        //自己调自己
        //一直调用，会死循环，会报错，在内存溢出
        System.out.println("我是一个死循环");
        a();
    }
}
