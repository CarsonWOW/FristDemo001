package Test19;

public class Dog {
    public String ID;
    public String name;
    public String kind;

    public Dog(String ID, String name, String kind) {
        this.ID = ID;
        this.name = name;
        this.kind = kind;
    }

    public Dog() {

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                '}';
    }

}
