package TrainBookingSystem;

public class User {
    private String fullName;
    private String username;
    private String password;
    private String contact;

    public User(String fullName, String username, String password, String contact) {
        this.fullName = fullName;
        this.username = username;
        this.password = password;
        this.contact = contact;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "UserName: "+username+" ("+username+")";
    }
}
