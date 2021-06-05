package Test13;

public class Testcomputer {
    public static void main(String[] args) {
        //new一个对象，创建对象，实例化
        computer computer=new computer();
        System.out.println(computer.getStrian());
        System.out.println("电脑品牌为:"+computer.getStrian());
        System.out.println("电脑价格为:"+ computer.getMoney()+"元");
        computer.setNum(200);
        computer.setSystemic("windos10");

    }

}
