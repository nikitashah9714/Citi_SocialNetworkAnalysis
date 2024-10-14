package com.project.controller;

import com.project.model.User;
import com.project.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(path = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    private final static Logger log = LoggerFactory.getLogger(FriendshipController.class);

    @PostMapping("/createUser")
    public void createUser(@RequestBody User user)
    {
        log.info("Creating user: " + user.toString());
        userService.createUser(user);

    }

    @PostMapping("/deleteUser")
    public void createUser(@RequestParam Integer userID)
    {
        log.info("Deleting user: " + userID);
        userService.deleteUser(userID);

    }

    @GetMapping("/getUserByUserID")
    public User getUserByUserID(@RequestParam Integer userID)
    {
        log.info("Fetching users by UserID " + userID);
        return userService.getUserByUserID(userID);

    }

    @GetMapping("/getAllUsers")
    public Map<Integer, User> getAllUsers()
    {
        log.info("Fetching all the users");
        return userService.getAllUser();

    }

}
