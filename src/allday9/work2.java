package allday9;

import java.util.Scanner;

public class  work2 {
    public static void main(String[] args) {
        //登录菜单跳转到主菜单,登录为1,退出为2
        System.out.println("1.登录系统");
        System.out.println("2.退出");
        System.out.println("* * * * * * * * * * * * * * * * * *");
        Scanner num=new Scanner(System.in);//接受信息指令
        System.out.println("请选择，输入数字：");
        int Num=num.nextInt();
        switch (Num){
            case 1:
                System.out.println("登录成功");//登录成功则跳转到第二级主菜单
                System.out.println("1.客户信息管理");//第二级主菜单
                System.out.println("2.购物结算");
                System.out.println("3.真情回馈");
                System.out.println("4.注销");
                System.out.println("请选择，输入数字：");
                int sc=num.nextInt();
                if(sc==1){
                    System.out.println("购物管理系统》客户信息管理");
                    System.out.println("1.显示所有客户信息");
                    System.out.println("2.添加客户信息");
                    System.out.println("3.修改客户信息");
                    System.out.println("4.查询客户信息");
                } else if(sc==3){
                    System.out.println("购物管理系统》真情回馈");
                    System.out.println("1.幸运大放送");
                    System.out.println("2.幸运抽奖");
                    System.out.println("3.生日问候");
                } else if(sc==4){
                    System.out.println("注销成功！");
                }else {
                System.out.println("系统正在修改中，请稍等");
                }

                break;
            case 2:
                System.out.println("谢谢您的使用！");

            default:
                System.out.println("输入有误");
                break;




        }


    }
    }







