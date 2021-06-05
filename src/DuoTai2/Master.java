package DuoTai2;

public class Master {
    //主人类喂食,生成以父类为对象的参数方法
    void feedPet(Pet pet){
        pet.eat();//在调用吃的方法

    }
    /**
     * 玩的方法
     */
   void play(Pet pet){
       if (pet instanceof Dog ){//如果是狗,将宠物对象强转为狗对象
           Dog dog=(Dog)pet;
           dog.CathcingF();//在调用狗玩的方法
       }else if (pet instanceof Penguin){
           Penguin penguin= (Penguin) pet;
           penguin.Swimming();
       }
   }

    }



