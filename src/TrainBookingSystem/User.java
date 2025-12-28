package TrainBookingSystem;

public class User {
    private String fullname;
    private String username;
    private String password;
    private String contact;

    public User(String fullname, String username, String password, String contact) {
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        this.contact = contact;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
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
    public String toString(){
        return fullname+" ("+username+") ";
    }
}
