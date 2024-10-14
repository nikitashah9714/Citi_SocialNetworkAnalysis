package com.project.controller;

import com.project.model.User;
import com.project.service.UserService;
import lombok.extern.slf4j.Slf4j;
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

    @PostMapping("/createUser")
    public void createUser(@RequestBody User user)
    {
        //log.info("Creating user: " + user.toString());
        userService.createUser(user);

    }

    @PostMapping("/deleteUser")
    public void createUser(@RequestParam Integer userID)
    {
        userService.deleteUser(userID);

    }

    @GetMapping("/getUserByUserID")
    public User getUserByUserID(@RequestParam Integer userID)
    {
        return userService.getUserByUserID(userID);

    }

    @GetMapping("/getAllUsers")
    public Map<Integer, User> getAllUsers()
    {
        return userService.getAllUser();

    }

}
