package DuoTai2;

/**
 * 生成抽象方法,让子类全部实现父类的方法
 */
public abstract class Pet {
    private String name;
    private int helth;
    private int love;

    abstract void eat();

    void pirnt(){
        System.out.println("宠物的自白:\n我的名字叫"+this.name+",我的健康值是"+this.helth+",与主人的亲密度为" +
                this.love);
    }

    public Pet(int helth, int love) {
        this.helth = helth;
        this.love = love;
    }

    public String getName() {
        return name;
    }

    public int getHelth() {
        return helth;
    }

    public int getLove() {
        return love;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHelth(int helth) {
        this.helth = helth;
    }

    public void setLove(int love) {
        this.love = love;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", helth=" + helth +
                ", love=" + love +
                '}';
    }
}
