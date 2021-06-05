package Test27;

import Test26.UserDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test01 {
   private static List<User> users=new ArrayList<>();
    private static List<Dog> dogs=new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static {
        User user=new User(1,"张三","123456");
        User user1=new User(2,"李四","123456");
        users.add(user);
        users.add(user1);
    }

    static {
        Dog dog=new Dog(1,"小白","哈士奇",90);
        Dog dog1=new Dog(2,"小黑","田园犬",80);
        Dog dog2=new Dog(3,"小红","腊肠犬",70);
        Dog dog3=new Dog(4,"小绿","藏獒",90);
        dogs.add(dog);
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
    }

    public static void main(String[] args) {
        System.out.println("**********欢迎来到宠物管理系统***********");
        while (true){
            System.out.print("1登录      2注册      3退出");
            int num=sc.nextInt();

            if(num==1){

                User user=Login();
                if(user!=null){
                    System.out.print("登录成功");

                    System.out.print("1客户信息管理      2，宠物信息管理");
                    int num1=sc.nextInt();
                    while (true){
                        if(num1==1){
                            System.out.println("1.添加数据,2.查询数据3.修改数据");
                            int num2=sc.nextInt();
                            if(num2==1){
                                System.out.println("请输入你要添加的ID：");
                                int ID=sc.nextInt();
                                System.out.println("请输入你要添加的用户名:");
                                String name=sc.next();
                                System.out.println("请输入你要添加的密码：");
                                String password=sc.next();
                                //把输入的值存入对象
                                User user1=new User(ID,name,password);
                                //存入集合
                                users.add(user1);
                                System.out.println("添加成功");
                                //查询数据
                    }else if(num2==2){
                                //遍历集合
                                for (User n:users){
                                    System.out.println(n);
                                }
                                //修改数据
                            }else if (num2==3){
                                System.out.println("请输入你要修改的ID");
                                int id=sc.nextInt();
                                //输入ID后，查询该ID的集合对象
                                UserTest userTest=new UserTest();
                                User user1=userTest.findbyid(users,id);
                                System.out.println(user1);
                                //调用修改的方法
                               users= userTest.UpdateUser(users,user1);
                                System.out.print("请输入你要修改的账户名:");
                                String name=sc.next();
                                user.setUsername(name);
                                System.out.print("请输入你要修改的密码：");
                                String psw=sc.next();
                                user.setUserpsw(psw);
                                System.out.println("修改成功");



                            }


                        }if (num1==2){
                            System.out.println("1.添加狗的数据,2.查询狗的数据 3.删除狗数据  4.根据狗的ID查询数据");
                            int num3=sc.nextInt();
                            if (num3==1){
                                System.out.print("请输入你要添加的狗的ID");
                                int id=sc.nextInt();
                                System.out.print("请输入你要添加的狗的名字");
                                String name=sc.next();
                                System.out.print("请输入你要添加的狗的品种");
                                String kinds=sc.next();
                                System.out.print("请输入你要添加的狗的亲密度：");
                                int loves=sc.nextInt();
                                System.out.println("添加成功！");
                                //将添加的信息,存入集合对象
                                Dog dog4=new Dog(id,name,kinds,loves);
                                //添加到集合
                                dogs.add(dog4);
                            }else if (num3==2){
                                //查询狗的数据
                                //循环遍历
                                for (Dog u:dogs){
                                    System.out.println(u);
                                }
                            }else if (num3==3){
                                System.out.println("请输入你要删除的狗的ID");
                                int id=sc.nextInt();
                                for (int i=0;i<dogs.size();i++){
                                    if(id==1){
                                        dogs.remove(0);
                                        System.out.println("删除成功");
                                        break;
                                    }else if(id==2){
                                        dogs.remove(1);
                                        System.out.println("删除成功");
                                        break;
                                    }else if (id==3){
                                        dogs.remove(2);
                                        System.out.println("删除成功");
                                        break;
                                    }else if(id==4){
                                        dogs.remove(3);
                                        System.out.println("删除成功");
                                        break;
                                    }

                                }
                                //根据ID查询数据
                            }if (num3==4){
                                //调用方法
                                DogTest dogTest=new DogTest();
                                System.out.print("请输入你要查找的ID");
                                int id=sc.nextInt();
                               Dog dog= dogTest.findbyid(dogs,id);
                                System.out.println(dog);
                            }

                        }

                    }

                }else {
                    System.out.println("登录失败");
                }
            }else if (num==2){
                boolean b=register();
                System.out.println(b);
                System.out.println("注册成功");


            }else if(num==3) {
                System.out.println("退出程序");
                break;
            }else {
                System.out.println("输入错误");
            }
        }
    }
    //注册
    private static boolean register() {
        boolean flag=false;//初始化
        System.out.print("请创建你的ID：");
        int id=sc.nextInt();
        System.out.print("请创建你的用户名：");
        String name=sc.next();
        System.out.print("请创建你的密码：");
        String psw=sc.next();
        //把输入的值存入对象
        User user2=new User(id,name,psw);
        //将信息放到集合中
        users.add(user2);
        flag=true;//注册成功
        return flag;
    }
    //登录
    private static User Login() {
        User user=null;
        System.out.print("请输入用户名：");
        String uname=sc.next();
        System.out.print("请输入密码：");
        String upsw=sc.next();
        //循环遍历user集合中的信息
        for (User u:users){
            if(u.getUsername().equals(uname) && u.getUserpsw().equals(upsw)){
                user=u;
                return user;
            }
        }
        return user;
    }
}










