package Test27;

import java.util.List;

public class DogTest {
    //创建根据Id 查询数据方法
    public Dog findbyid(List<Dog> lists,int id){
        Dog dog=null;
        for (Dog u:lists){
            if(u.getUid()==id){
                dog=u;
                return dog;
            }
        }
        return dog;
    }

}
