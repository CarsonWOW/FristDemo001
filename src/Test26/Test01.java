package Test26;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test01 {
    private static List<User> users = new ArrayList<User>();
    private static  List<Dog> dogs =new ArrayList<Dog>();
    static  Scanner  sc = new Scanner(System.in);
    static {
        User user1 = new User(1,"张三","123456");
        User user2 = new User(2,"李四","123456");
        users.add(user1);
        users.add(user2);
    }
    static {
        Dog dog=new Dog("小白","哈士奇",80);
        Dog dog1=new Dog("小黑","田园犬",90);
        Dog dog2=new Dog("吉吉","腊肠犬",60);
        Dog dog3=new Dog("小黄","藏獒",100);
        dogs.add(dog);
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);


    }

    public static void main(String[] args) {
        System.out.println("**********欢迎来到宠物管理系统*********");
        //创建对象
        UserDao userDao = new UserDao();
        DogDao dogDao=new DogDao();


        while (true){
            System.out.println("请选择1:登陆：2注册 3,退出  ");
            int typeId= sc.nextInt();
            if(typeId==1){
                User user = login();
                if(user!=null){
                    System.out.println("登陆成功");
                    while (true){
                        System.out.println("1.个人信息管理，2.宠物信息管理");
                        int checkId = sc.nextInt();
                        if(checkId==1){
                            System.out.println("1.添加数据,2.查询数据3.修改数据");
                            int userTypeId = sc.nextInt();
                            if(userTypeId==1){
                                System.out.println("1.添加数据");
                                //调用添加方法
                                users =userDao.addUser(users);
                                System.out.println("添加成功");
                            }else if(userTypeId==2){
                                for(User u:users){
                                    System.out.println(u);
                                }
                            }else  if(userTypeId==3){
                                System.out.println("请输入修改用户id");
                                int uid = sc.nextInt();
                                //实际开发，只选通过id查询出User对象
                                User user1 = userDao.findById(users,uid);
                                //然后再调用修的方法
                                users=userDao.updateUser(users,user1);
                                System.out.println("修改成功");
                            }
                        }else if(checkId==2){
                            System.out.println("1.添加狗的数据,2.查询狗的数据 3.删除狗数据  4.根据狗的ID查询数据");
                            int num=sc.nextInt();
                            if(num==1){
                                System.out.println("给狗添加数据");
                                //添加数据方法
                                dogs=dogDao.addUser(dogs);
                                System.out.println("添加成功");
                            }else if(num==2){
                                for (Dog s:dogs){
                                    System.out.println(s);
                                }
                            }else if(num==3){
                                System.out.println("删除狗数据：请输入狗的名字");
                                String name=sc.next();
                                //增强循环
                                for (int i=0;i<dogs.size();i++){
                                    if(name.equals("小白")){
                                        dogs.remove(0);
                                    } else if(name.equals("小黑")){
                                        dogs.remove(1);
                                    }else if(name.equals("吉吉")){
                                        dogs.remove(2);
                                }else if(name.equals("小黄"))
                                    dogs.remove(3);
                                System.out.println("删除成功");
                            }if (num==4){
                                    System.out.print("请输入狗的名字：");
                                    String name1=sc.next();
                                    Dog dog=dogDao.findById(dogs,name1);

                                }


                            }
                        }
                    }



                }else {
                    System.out.println("登陆失败");
                }
            }else if(typeId==2){
                System.out.println("注册");
                boolean b= register();
                System.out.println(b);
            }else if (typeId==3){
                System.out.println("程序退出");
                return;
            }else {
                System.out.println("输入有误，程序退出");
                return;
            }
        }

    }

    //注册
    private static boolean register() {
        boolean flag = false;
        System.out.println("请输入id");
        int id = sc.nextInt();
        System.out.println("请输入用户名");
        String uname =sc.next();
        System.out.println("请输入密码");
        String pwd = sc.next();
        //把输入的值存入对象
        User user = new User(id,uname,pwd);
        //把对象存入集合中
        users.add(user);
        flag=true;//设置为注册成功
        return flag;
    }

    //登陆
    private static User login() {
        User user = null;
        System.out.print("请输入用户名:");
        String uname =sc.next();
        System.out.print("请输入密码:");
        String pwd = sc.next();

        /**
         * 是不是要调用登陆的方法,实际开发，会再创建一个类
         * 因为现在没有使用数据库只能这样写
         */
        for(User u:users){//循环遍历集合对象users
            //是不是相等
            if(u.getUname().equals(uname)&& u.getPassword().equals(pwd)){
                user=u;//如果进来了，把
                return user;//登陆成功了直接跳出，后面不要循环了
            }
        }
        return user;
    }
}


