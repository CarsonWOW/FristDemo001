package Test16;

/**
 * 之前的继承是写 extends,接口不写extends了
 * implements 实现 MyInterface
 */
//public class InterfaceImpl implements MyInterface {
public class InterfaceImpl implements MyInterface,MyInterface2{
    @Override
    public void addUser() {
        System.out.println("添加用户");
    }

    @Override
    public int deleteUser(int id) {
        //今后开发过程中，这里面有很多的业务逻辑代码
        //不管你怎么实现的，最终返回一个值
        System.out.println("删除用户信息");
        return 0;
    }

    @Override
    public void UpdateUser() {
        System.out.println("修改用户信息");
    }
}
