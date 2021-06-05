package DuoTai;

public class Penguin extends Pet {


    public Penguin(String name, int health, int love) {
        super(name, health, love);
    }

    @Override
    void eat() {
        if (this.getHealth() >= 100) {
            System.out.println("企鹅吃饱了，不需要在喂");
        } else {
            System.out.println("企鹅吃饱了，健康值增加5,亲密度增加5");
            //狗吃完后，健康值增加5
            this.setHealth(getHealth() + 5);
            this.setLove(getLove() + 5);
        }
    }
    //主人带企鹅游泳
    public void swimming1(){
        System.out.println("主人正在带企鹅游泳");
        this.setHealth(this.getHealth()-10);
        this.setLove(this.getLove()+5);
    }
}
