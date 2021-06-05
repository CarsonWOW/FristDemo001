package Test26;

public class Dog {
    private String name;//默认是null
    private String strain="品种1";
    private int love; //默认是0


    public Dog(String name, String strain, int love) {
        this.name = name;
        this.strain = strain;
        this.love = love;

    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }




    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", strain='" + strain + '\'' +
                ", love=" + love +

                '}';
    }
}
