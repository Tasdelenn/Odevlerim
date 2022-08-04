package Odevlerim.IsmetHocadan.Odevlerim_33_10Haz;

public class User {

    private int id ;
    private String username;
    private String password;
    private boolean active;
    private boolean signedIn;
    
    private static int sayac = 0;
    
    userRole role;


    public User() {
    }



    public User(String username, String password, boolean active, boolean signedIn,userRole role) {

        setUsername(username);
        setPassword(password);
        setActive(active);
        setSignedIn(signedIn);
        setRole(role);
    }

    private void setRole(userRole role) {
    }

    @Override
    public String toString() {


        return "User{" +
                "id=" + sayac +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                ", signedIn=" + signedIn +
                ", userRole" + role +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id ) {
        this.id = ++sayac;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignedIn() {
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }


    public userRole getRole() {
        return role;
    }


}

