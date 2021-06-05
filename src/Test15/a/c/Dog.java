package Test15.a.c;

public class Dog extends Pet{
    //属性
    public String name;
    public int health;
    public int love;
    public String strin;

    public void print(){
        System.out.println("我的名字叫"+this.name+" 我的健康值是"+this.health+" 我与主人的亲密度是"+this.love+",品种为："+strin);
    }
}

