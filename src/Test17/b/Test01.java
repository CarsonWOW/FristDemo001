package Test17.b;

import Test17.c.Print;

public class Test01 {
    public static void main(String[] args) {

        System.out.println("我的组装电脑配置：");
        CPU cpu=new BordAndBasic();
        System.out.println("CPU频率为："+cpu.getbasic());
        System.out.println("CPU品牌为："+cpu.getBord());
        EMS ems=new Capacity();
        System.out.println("内存容量为："+ems.getcapacity());
        HardDisk hardDisk=new Hcapacity();
        System.out.println("硬盘容量为："+hardDisk.getHcapacity());









    }
}
