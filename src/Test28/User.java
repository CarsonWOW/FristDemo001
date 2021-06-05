package Test28;

public class User {
    private int uid;
    private String uname;
    private String pasw;

    public User(int uid, String uname, String pasw) {
        this.uid = uid;
        this.uname = uname;
        this.pasw = pasw;
    }

    public User() {
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPasw() {
        return pasw;
    }

    public void setPasw(String pasw) {
        this.pasw = pasw;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", pasw='" + pasw + '\'' +
                '}';
    }
}
