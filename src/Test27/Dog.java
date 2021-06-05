package Test27;

public class Dog {
    private int uid;
    private String name;
    private String kind;
    private int love;

    public Dog(int uid, String name, String kind, int love) {
        this.uid = uid;
        this.name = name;
        this.kind = kind;
        this.love = love;

    }

    public Dog() {
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
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

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                ", love=" + love +
                '}';
    }
}
