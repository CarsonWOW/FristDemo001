package Test14.d;
//父类

public class Pet {
    private String name;
    private int health;
    private int love;
    public void setName(String name){
        this.name=name;
    }
    public int getHealth() {
        return health;
    }
    public int getLove() {
        return love;
    }
    public Pet(){

    }
    public Pet(String name,int health,int love){
        this.name=name;
        this.health=health;
        this.love=love;
    }
    public void show(){
        System.out.println("宠物的自白：我的名字叫"+name+",我的健康值是"+health+",我和主人的亲密度是"+love);
    }
}



