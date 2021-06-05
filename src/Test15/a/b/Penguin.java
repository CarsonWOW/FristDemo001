package Test15.a.b;

public class Penguin extends Pet {
    private String name = "昵称2";
    private int health = 100;
    private int love = 100;

    @Override
    public void eat() {

//健康值，亲密度最大值只能加到100,不能穿负数,
        //如果健康值本来是98，喂食之后也不能超过100
        while (true  ){
            if(this.getHealth()<0 || this.getLove()<0)
            System.out.println("不能为负数");
            break;

        }
         if (this.getHealth() >= 100 || this.getHealth()+5>=100) {
            System.out.println("企鹅吃饱了，不需要在喂");
        } else {
            System.out.println("企鹅吃饱了，健康值增加5,亲密度增加5");
            super.setHealth(super.getHealth() + 5);
            super.setLove(super.getLove() + 5);
        }



    }
    //主人带企鹅游泳
    public void swimming(){
        System.out.println("主人正在带企鹅游泳");
        this.setHealth(this.getHealth()-10);
        this.setLove(this.getLove()+5);
    }
}










