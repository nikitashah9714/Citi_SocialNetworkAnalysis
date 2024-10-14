package com.project.service;

import com.project.model.User;

import java.util.Map;

public interface UserService {

    public abstract void createUser(User user);
    public abstract void deleteUser(Integer userID);
    public abstract User getUserByUserID(Integer userID);
    public abstract Map<Integer, User> getAllUser();
}
