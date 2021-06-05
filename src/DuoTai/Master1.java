package DuoTai;

public class Master1 {
    //方法参数为宠物对象
    void feedPet(Pet pet) {
        pet.eat();//调用宠物吃的方法
    }

    /**
     * 领养宠物方法
     */
    //创建一个以宠物为对象的领养方法
    public Pet getPet1(int kind) {
        Pet pet=null;
        if (kind == 1) {
            pet = new Dog("多多", 60, 30);

        }else  if (kind==2){
            pet=new Penguin("企鹅",70,50);
        }else {
            System.out.println("输入错误");
        }
        return pet;

    }
    /**
     * 主人类添加玩的方法
     */
    public void play(Pet pet){
        if (pet instanceof Dog){
            Dog dog=(Dog) pet;
            dog.Cathing();//调用方法
        }else if (pet instanceof Penguin){
            Penguin penguin= (Penguin) pet;
            penguin.swimming1();
        }
    }
}
