package Test15.a.c;

public class Penguin extends Pet {
    public String name;
    public int health ;
    public int love ;
    public String sex;

    //重写父类
    public void print() {

        System.out.println("我的名字叫" + this.name + " 我的健康值是" + this.health + " 我与主人的亲密度是" + this.love+" 我的性别是"+this.sex);
    }
}
