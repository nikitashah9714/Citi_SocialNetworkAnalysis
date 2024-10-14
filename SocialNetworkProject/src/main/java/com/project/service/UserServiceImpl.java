package com.project.service;

import com.project.model.User;
import com.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void createUser(User user) {
        userRepository.createUser(user);
    }

    @Override
    public void deleteUser(Integer userID) {
        userRepository.deleteUser(userID);
    }

    @Override
    public User getUserByUserID(Integer userID) {
        return userRepository.getUserByUserID(userID);
    }

    @Override
    public Map<Integer, User> getAllUser() {
        return userRepository.getAllUsers();
    }


}
