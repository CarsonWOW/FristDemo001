package Test19;

public class Phone {
    public String borad;
    public int pirec;

    @Override
    public String toString() {
        return "Phone{" +
                "borad='" + borad + '\'' +
                ", pirec=" + pirec +
                '}';
    }

    public Phone(String borad, int pirec) {
        this.borad = borad;
        this.pirec = pirec;
    }
}

