package Test27;

import java.util.List;

public class UserTest {
    //创建修改User数据方法
    public List<User>UpdateUser(List<User> lists, User user){
        List<User> users=lists;
        for (int i=0;i<users.size();i++){
            //输入的ID等于集合中存在的ID，执行下一步操作
            if(user.getUid()==lists.get(i).getUid());

            //用指定的元素替代此列表中指定位置上的元素。
            users.set(i,user);
        }
        return users;
    }
    //创建根据id 查找用户的方法
    public User findbyid(List<User> lists,int id){
        User user=null;
        //循环遍历
        for (User u:lists){
            if (u.getUid()==id){
                user=u;
                return user;
            }
        }
     return user;
    }
}
