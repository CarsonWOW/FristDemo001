package Test15.a.b;

/**多态
 * 实现多态需遵循3个规范
 * 1.必须有继承，必需有父类子类
 * 2.子类必需重写父类的方法， 因为子类都是不同的实现方式
 * 3.父类引用指向子类的对象
 */
//主人类，负责喂食
public class Master {
    //给宠物喂食，不指向其他2个子类
    public void feed(Pet pet){
        pet.eat();
    }
    /**
     * 领养宠物方法
     */
    public Pet getpet(int typed){
        Pet Pet=null;
        if(typed==1){

             Pet=new Dog();
        }else if(typed==2){

            Pet=new Penguin();
        }


        return Pet;
    }
    //主人类添加玩的方法
    public void play(Pet pet){
        //如果传递过来是Dog,那么需要调用dog中的cathcingFlyDist
            if(pet instanceof Dog){//pet是不是 Dog
                //如果是dog
                Dog dog=(Dog) pet;
                dog.cathcingFlyDist();
            }else if(pet instanceof Penguin){
                //如果是企鹅
                Penguin penguin=(Penguin)pet;//强转，小的转大的
                penguin.swimming();
            }
    }


    }

