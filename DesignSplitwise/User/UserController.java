/*
 * Class to maintain list of users
 * - Add user to list
 * - Get a specific user
 * - Get all users
 */
package DesignSplitwise.User;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    List<User> userList;

    public UserController(){
        userList = new ArrayList<>();
    }

    // Add a new user to list
    public void addUser(User user){
        userList.add(user);
    }

    // Get user given user ID
    public User getUser(String userId){
        for(User user: userList){
            if(user.getUserId().equals(userId)){
                return user;
            }
        }
        return null;
    }

    // Get all users
    public List<User> getAllUsers(){
        return userList;
    }
}
