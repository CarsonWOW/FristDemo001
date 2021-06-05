package Test27;

public class User {
    private int uid;
    private String Username;
    private String Userpsw;

    public User(int uid, String username, String userpsw) {
        this.uid = uid;
        Username = username;
        Userpsw = userpsw;
    }

    public User() {
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getUserpsw() {
        return Userpsw;
    }

    public void setUserpsw(String userpsw) {
        Userpsw = userpsw;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", Username='" + Username + '\'' +
                ", Userpsw='" + Userpsw + '\'' +
                '}';
    }
}
