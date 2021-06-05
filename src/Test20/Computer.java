package Test20;

public class Computer {
    private String borad;
    private int pirec;

    @Override
    public String toString() {
        return "Computer{" +
                "borad='" + borad + '\'' +
                ", pirec=" + pirec +
                '}';
    }

    public Computer(String borad, int pirec) {
        this.borad = borad;
        this.pirec = pirec;


    }
}
