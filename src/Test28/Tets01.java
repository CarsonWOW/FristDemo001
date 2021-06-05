package Test28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tets01 {
    static Scanner sc=new Scanner(System.in);
    private static List<User> users=new ArrayList<>();
    static {
        User user=new User(1,"张三","123456");
        users.add(user);
    }

    public static void main(String[] args) {
        System.out.println("******欢迎来到XXX系统********");
        while (true){
            System.out.println("1登录   2注册    3退出");
            int num=sc.nextInt();
            if (num==1){
                User user=Login();
                if (user!=null){
                    System.out.println("登录成功");
                    while (true){
                        System.out.print("1 根据ID用户查询   2添加用户  3查看所有信息 ");
                        int num1=sc.nextInt();
                        if (num1==1){
                            //根据用户ID查询数据
                            System.out.print("请输入你要查询的ID：");
                            int id=sc.nextInt();
                            for (User u:users){
                                if(u.getUid()==id){
                                    System.out.println(u);
                                }
                            }
                            //添加用户
                        }else if (num1==2){
                            System.out.print("请输入你要添加的ID:");
                            int id=sc.nextInt();
                            System.out.print("请输入你要添加的用户名：");
                            String name=sc.next();
                            System.out.print("请输入你要添加的密码：");
                            String password=sc.next();
                            System.out.println("添加成功");
                            User user1=new User(id,name,password);
                            users.add(user1);
                        }else if(num1==3){
                            //查看所有用户信息
                            for (User u:users){
                                System.out.println(u);
                            }
                        }
                    }


                }else  {
                    System.out.println("登录失败");
                }
                //注册
            }else if (num==2){
                boolean b=  zhuce();
                System.out.println("创建成功");


            }else if (num==3){
                System.out.println("退出程序");
                return;
            }else {
                System.out.println("输入有误！程序退出");
                return;
            }
        }

    }

    private static boolean zhuce() {
        boolean flag=false;
        System.out.print("请创建你的ID：");
        int id=sc.nextInt();
        System.out.print("请创建你的用户名：");
        String name=sc.next();
        System.out.print("请创建你的密码：");
        String ps=sc.next();
        User user=new User(id,name,ps);
        users.add(user);
        flag=true;
        return false;
    }

    //登录方法
    private static User Login() {
        User user=null;
        System.out.print("请输入你的ID：");
        int id=sc.nextInt();
        System.out.print("请输入你的用户名：");
        String uname=sc.next();
        System.out.print("请输入你的密码：");
        String upsw=sc.next();
        for (User u:users){
            user=u;
            if (u.getUname().equals(uname) && u.getPasw().equals(upsw));
            return user;
        }
        return user;
    }

}
