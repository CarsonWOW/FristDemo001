package DuoTai;

public abstract class Pet {
    private String name="昵称1";
    private int health=100;
    private int love=100;
    //生产抽象方法，进行宠物喂食功能
     abstract void eat();
     //宠物的自白
    public void print(){
        System.out.println("我的名字叫"+this.name+",我的健康值是"+this.health+",我于主人的亲密度为"+this.love);
    }


    public Pet(String name, int health, int love) {
        this.name = name;
        this.health = health;
        this.love = love;
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

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getLove() {
        return love;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", love=" + love +
                '}';
    }
}
