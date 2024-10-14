package com.project.repository;

import com.project.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository {

    //User Map to hold user data
    private Map<Integer, User> userMap = new HashMap<>();

    public void createUser(User user) {
        userMap.put(user.getUserID(), user);
    }

    public void deleteUser(Integer userID) {
        userMap.remove(userID);
    }

    public User getUserByUserID(Integer userID) {
        return userMap.get(userID);
    }

    public Map<Integer, User> getAllUsers() {
        return userMap;
    }

}
