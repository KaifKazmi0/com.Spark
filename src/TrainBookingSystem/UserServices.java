package TrainBookingSystem;

import java.util.HashMap;
import java.util.Map;

public class UserServices
{
    Map<String,User> usermap = new HashMap<>();
    User currentUser = null;

    public boolean registerUser( String fullname,String username,String password,String contact){
        if (usermap.containsKey(username)){
            System.out.println("user name already taken, try another");
            return false;
        }
        User user = new User(fullname,username,password,contact);
        usermap.put(username,user);
        return true;
    }

    public boolean loginUser(String username,String password){
        if (!usermap.containsKey(username)){
            System.out.println("user doesn't exist");
            return false;
        }
        User user = usermap.get(username);
        if (!user.getPassword().equals(password)){
            System.out.println("password is incorrect");
            return false;
        }
        currentUser = user;
        return true;
    }

    public boolean logoutUser(){
        if (currentUser!=null){
            System.out.println("User logged out successfully");
            currentUser = null;
        }
        return false;
    }

    public User getCurrentUser(){
        return currentUser;
    }

    public boolean isLoggedIn(){
        return currentUser != null;
    }

}
