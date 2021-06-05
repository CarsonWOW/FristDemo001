package Test15.a.b;

public abstract class Pet {
    private String name="昵称";
    private int health = -100;
    private int love =50;

    //创建一个抽象方法，负责宠物喂食的功能
    public abstract void eat();

    public void print() {
        System.out.println("宠物的自白：我的名字为:" + this.name + "，我的健康值是：" + health + ",我与主人的亲密度是" + this.love);
    }
//生成getter/setter方法

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public String getName() {
        return name;

    }

    public int getHealth() {
        return health;
    }

    public int getLove() {
        return love;
    }
}



