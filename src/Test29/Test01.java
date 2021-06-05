package Test29;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test01 {
    static Scanner sc=new Scanner(System.in);
    private static List<User> users=new ArrayList<>();
    private static List<Dog> dogs=new ArrayList<>();
    static {
        User user=new User(0,"张三","123456");
        User user1=new User(1,"李四","123456");
        users.add(user);
        users.add(user1);
    }
    static {
        Dog dog=new Dog(0,"小黄",80,"田园犬");
        Dog dog1=new Dog(1,"小微",70,"土狗");
        Dog dog2=new Dog(2,"小黑",60,"拉布拉多");
        Dog dog3=new Dog(3,"小白",50,"贵宾犬");
        dogs.add(dog);
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
    }

    public static void main(String[] args) {
        System.out.println("**********欢迎来到宠物管理系统**********");
        while (true){
            System.out.println("1登录  2注册   3退出");
            int num=sc.nextInt();
            if (num==1){
                User user = Login();
                if (user!=null){
                    System.out.println("登录成功");
                    System.out.println("1.用户信息管理     2宠物信息管理");
                    int num1=sc.nextInt();
                    //查询所有用户信息




                    //宠物信息管理
                    while (true){
                        if (num1==1){
                            System.out.print("1查询所有用户信息  2根据ID查找用户信息  3添加用户信息  4修改用户信息");
                            int num2=sc.nextInt();
                            if (num2==1){
                                for (User u:users){
                                    System.out.println(u);
                                }
                            }else if (num2==2){
                                System.out.print("请输入你要查找的ID:");
                                int id=sc.nextInt();
                                for (User u:users){
                                    if (u.getUid()==id){
                                        System.out.println(u);
                                    }
                                }
                            }else if (num2==3){
                                System.out.print("请输入你要添加的ID：");
                                int id=sc.nextInt();
                                System.out.print("请输入你要添加的账户名:");
                                String uname=sc.next();
                                System.out.print("请输入你要添加的密码：");
                                String psw=sc.next();
                                System.out.println("添加成功！");
                                User user4=new User(id,uname,psw);
                                users.add(user4);
                            }else if (num2==4){
                                System.out.print("请输入你要修改的ID：");
                                int uid=sc.nextInt();
                                for (int i=0;i<users.size();i++){
                                    if (user.getUid()==uid){
                                        System.out.print("请输入你要修改的账户：");
                                        String uname=sc.next();
                                        user.setUname(uname);
                                        System.out.print("请输入你要修改的密码：");
                                        String pasw=sc.next();
                                        user.setPsw(pasw);
                                        System.out.println("修改成功！");
                                        break;
                                    }
                                }
                            }
                        }else if (num1==2){
                            System.out.println("1查询宠物所有信息  2根据ID查找宠物信息及介绍  3添加宠物信息  4删除宠物信息");
                            int choice=sc.nextInt();
                            if (choice==1){
                                for (Dog u:dogs){
                                    System.out.println(u);
                                }
                            }else if (choice==2){
                                System.out.print("请输入你要查找的ID：");
                                int id=sc.nextInt();
                                for (Dog u:dogs){
                                    if (u.getUid()==id){
                                        System.out.println(u);
                                        u.pirt();
                                    }
                                }
                            }else if (choice==3){
                                System.out.print("请输入你要添加的ID：");
                                int id=sc.nextInt();
                                System.out.print("请输入你要添加的狗的名字：");
                                String name=sc.next();
                                System.out.print("请输入你要添加的狗的健康值：");
                                int helh=sc.nextInt();
                                System.out.print("请输入你要添加的狗的品种：");
                                String bord=sc.next();
                                Dog dog5=new Dog(id,name,helh,bord);
                                dogs.add(dog5);
                                System.out.println("添加成功！");
                            }else if (choice==4){
                                System.out.print("请输入你要删除的宠物ID");
                                int id1=sc.nextInt();
                                System.out.println("删除成功！");
                                for (int i=0;i<dogs.size();i++){
                                    while (id1<dogs.size()){
                                        dogs.remove(id1);
                                        break;

                                    }
                                }

                            }
                        }
                    }

                }else  {
                    System.out.println("登录失败，请重新登录");
                }
                //注册
            }else if (num==2) {
                boolean b= zhuce();
                System.out.println(b);
                System.out.println("创建成功！");

            }else if(num==3){
                System.out.println("退出成功！");
                break;
            }else {
                System.out.println("输入错误");
            }
        }





    }



    private static boolean zhuce() {
        boolean flag=false;
        System.out.print("创建你的ID：");
        int id=sc.nextInt();
        System.out.print("创建你的用户名：");
        String uname=sc.next();
        System.out.print("创建你的密码：");
        String psw=sc.next();
        User user6=new User(id,uname,psw);
        users.add(user6);

        flag=true;
        return flag;
    }


    private static User Login() {
        User user=null;
        System.out.print("请输入你的账户名：");
        String name=sc.next();
        System.out.print("请输入你的密码:");
        String psw=sc.next();
        for (User u:users){
            if (u.getPsw().equals(psw) && u.getUname().equals(name)){
                user=u;
                return user;
            }
        }
        return user;
    }

}







