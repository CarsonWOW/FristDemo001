package DuoTai2;

public class Penguin extends Pet {
    public Penguin(int helth, int love) {
        super(helth, love);
    }
    //企鹅吃的方式
    public void eat(){
        if (this.getHelth()>=100){
            System.out.println("你的宠物:"+this.getName()+"不需要进食了");
        }else {
            System.out.println("你的宠物:"+this.getName()+"吃饱了,健康值增加5,亲密度增加5");
            this.setHelth(this.getHelth()+5);
            this.setLove(this.getLove()+5);
        }
    }
    void Swimming(){
        System.out.println(this.getName()+"正在游泳中,健康值减少5,亲密度增加10");
        this.setHelth(this.getHelth()-5);
        this.setLove(this.getLove()+10);
    }
}
