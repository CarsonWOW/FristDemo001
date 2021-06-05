package Test26;

import java.util.List;
import java.util.Scanner;

public class UserDao {
    static Scanner sc = new Scanner(System.in);
    public List<User> addUser(List<User> lists){
        List<User>  users= lists;
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
        return  users;
    }

    //根据id查询用户信息
    public User findById(List<User> lists,int id){
        User user = null;
        //经后开发过程中，直接调用数据库
        for(User u:lists ){
            if(u.getUid()==id){
                user=u;
                return  user;
            }
        }
        return user;
    }

    public List<User> updateUser(List<User> lists,User user){
        List<User> users = lists;

        //这种方法，以后操作购物车的时候会用到
        for(int i=0;i<users.size();i++){
            if(user.getUid()==lists.get(i).getUid()){
                user.setUname("刚修改的");
                users.set(i,user);
            }
        }

        return users;
    }
}
