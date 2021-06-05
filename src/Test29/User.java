package Test29;

public class User {
    private int uid;
    private String uname;
    private String psw;

    public User(int uid, String uname, String psw) {
        this.uid = uid;
        this.uname = uname;
        this.psw = psw;
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

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", psw='" + psw + '\'' +
                '}';
    }
}
