package Test16.work;
/**
 * 防盗门实现开门，关门，上锁，开锁功能
 * 拥有锁和门的接口
 */

public class SecurityDoor implements Door,Lock {
    @Override
    public void open() {
        System.out.println("开门，门开了");
    }

    @Override
    public void close() {
        System.out.println("关门，门关了");
    }

    @Override
    public void lockup() {
        System.out.println("上锁，锁上了");
    }

    @Override
    public void lockopen() {
        System.out.println("开锁，锁开了");
    }
}
