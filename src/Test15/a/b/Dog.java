package Test15.a.b;

public class Dog  extends Pet {
    private String name="昵称1";
    private int health=100;
    private int love=50;
    //
    public void eat(){


        if(this.getHealth()>=100 ){
            System.out.println("狗吃饱了，不需要在喂");
        }else{
            System.out.println("狗吃饱了，健康值增加5,亲密度增加5");
            //狗吃完后，健康值增加5
            this.setHealth(getHealth()+5);
            this.setLove(getLove()+5);
        }

    }
    //与主人玩接飞盘
    public void cathcingFlyDist(){
        //狗的健康值减少10，与主人亲密度增加5
        System.out.println("主人正在与狗狗玩接飞盘的游戏");
        this.setHealth(this.getHealth()-10);
        this.setLove(this.getLove()+5);
    }
}
