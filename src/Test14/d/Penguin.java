package Test14.d;
//企鹅类，子类
public class Penguin  extends Pet{


    public Penguin(){

    }

    public Penguin(String name,int health,int love){
        super(name,health,love);
    }
    //方法重写
    public void show(){
        super.show();//super父类的意思


    }
}
