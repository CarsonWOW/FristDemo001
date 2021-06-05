package LingYangChongWu;

public class Pet {
    private String name;
    private int helthly=100;
    private int love;
    private String sex;

    public void speak(){
        System.out.println("宠物的自白:\n我的名字叫"+this.getName()+"健康值是"+this.getHelthly()
                +",和主人的亲密度是"+this.getLove()+",性别是"+this.getSex());
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", helthly=" + helthly +
                ", love=" + love +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHelthly() {
        return helthly;
    }

    public void setHelthly(int helthly) {
        this.helthly = helthly;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
