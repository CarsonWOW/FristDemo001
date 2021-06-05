package DuoTai;

public class Dog extends Pet {

    public Dog(String name, int health, int love) {
        super(name, health, love);
    }

    @Override
    void eat() {
        if (this.getHealth()>=100){
            System.out.println("狗狗已经吃饱了,不需要在喂");
        }else {
            System.out.println("狗狗吃的很高兴,健康值增加5,亲密度增加5");
            this.setHealth(this.getHealth()+5);
            this.setLove(this.getHealth()+5);
        }
    }

    /**
     * 狗玩飞盘
     */
    void Cathing(){
        System.out.println("主人正在带"+this.getName()+"玩飞盘,亲密度增加10，健康减5");
        this.setLove(this.getLove()+10);
        this.setHealth(this.getHealth()+5);
    }
}


