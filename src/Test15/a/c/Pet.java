package Test15.a.c;

public class Pet {
   public String name;
    public int health;
    public int love;

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getLove() {
        return love;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public void print() {
        System.out.println("我的名字叫" + this.name + " 我的健康值是" + this.health + " 我与主人的亲密度是" + this.love);
    }
}
