package DuoTai2;

public class Dog extends Pet {

    public Dog(int helth, int love) {
        super(helth, love);
    }
    //狗的吃的方式
    public void eat(){
        if(this.getHelth()>=100){
            System.out.println("狗已经吃饱了,不需要在喂了");
        }else {
            System.out.println("狗进食完毕,健康值增加5,亲密度增加5");
            this.setHelth(this.getHelth()+5);
            this.setLove(this.getLove()+5);
        }
   }
   //狗玩的方式
    public void CathcingF(){
        System.out.println("狗正在玩接飞盘,健康值减少5,亲密度增加10");
        this.setHelth(this.getHelth()-5);
        this.setLove(this.getLove()+10);
    }

}
