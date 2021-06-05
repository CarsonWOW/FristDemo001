package Test26;

import java.util.List;
import java.util.Scanner;

public class DogDao {
    static Scanner sc = new Scanner(System.in);
    public List<Dog> addUser(List<Dog> lists){
        List<Dog>  dogs= lists;
        System.out.println("请输入狗的名字：");
        String name=sc.next();
        System.out.println("请输入狗的品种");
        String star =sc.next();
        System.out.println("请输入狗的亲密度");
        int love = sc.nextInt();
        //把输入的值存入对象
        Dog dog = new Dog(name,star,love);
        //把对象存入集合中
        dogs.add(dog);
        return  dogs;
    }

    //根据名字查询狗的信息
    public Dog findById(List<Dog> lists,String name){
        Dog dog = null;
        //经后开发过程中，直接调用数据库
        for(Dog u:lists ){
            if(u.getName()==name){
                dog=u;
                return  dog;
            }
        }
        return dog;
    }

    public List<Dog> updateUser(List<Dog> lists,Dog dog){
        List<Dog> dogs = lists;

        //这种方法，以后操作购物车的时候会用到
        for(int i=0;i<dogs.size();i++){
            if(dog.getName()==lists.get(i).getName()){
                dog.setName("刚修改的");
                dogs.set(i,dog);
            }
        }

        return dogs;
    }

}
