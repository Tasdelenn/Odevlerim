package Odevlerim.IsmetHocadan.Odev_14Haziran;

public class User {

    private int iD;
    private String userName;
    private String passWord;
    boolean isActive = false;
    boolean isSignedIn = false;

    userRole uRole;


    public User(int iD, String userName, String passWord, boolean isActive, boolean isSignedIn,userRole uRole) {
        this.iD = iD;
        this.userName = userName;
        this.passWord = passWord;
        this.isActive = isActive;
        this.isSignedIn = isSignedIn;
        this.uRole = uRole;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isSignedIn() {
        return isSignedIn;
    }

    public void setSignedIn(boolean signedIn) {
        isSignedIn = signedIn;
    }

    public userRole getuRole() {
        return uRole;
    }

    public void setuRole(userRole uRole) {
        this.uRole = uRole;
    }

    @Override
    public String toString() {
        return "User{" +
                "iD=" + iD +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", isActive=" + isActive +
                ", isSignedIn=" + isSignedIn +
                ", uRole=" + uRole +
                '}';
    }
}
