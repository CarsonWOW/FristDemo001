package Test29;

public class Dog {
    private int uid;
    private String dname;
    private int helthy;
    private String bord;

    public void pirt(){
        System.out.println("宠物的自白：");
        System.out.println("我的名字叫:"+this.dname+",我的健康值是"+this.helthy+",我的种类是"+this.bord);
    }

    public Dog(int uid, String dname, int helthy, String bord) {
        this.uid = uid;
        this.dname = dname;
        this.helthy = helthy;
        this.bord = bord;
    }

    public Dog() {
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public int getHelthy() {
        return helthy;
    }

    public void setHelthy(int helthy) {
        this.helthy = helthy;
    }

    public String getBord() {
        return bord;
    }

    public void setBord(String bord) {
        this.bord = bord;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "uid=" + uid +
                ", dname='" + dname + '\'' +
                ", helthy=" + helthy +
                ", bord='" + bord + '\'' +
                '}';
    }
}
