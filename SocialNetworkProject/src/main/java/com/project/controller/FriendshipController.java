package com.project.controller;

import com.project.service.FriendshipService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/friends", produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
public class FriendshipController {

    @Autowired
    private FriendshipService friendshipService;


    @PostMapping("/createFriendship")
    public void createFriendship(@RequestParam Integer userID1, Integer userID2)
    {
        //log.info("Creating user: " + user.toString());
        friendshipService.createFriendship(userID1, userID2);

    }

    @PostMapping("/deleteFriendship")
    public void deleteFriendship(@RequestParam Integer userID1, Integer userID2)
    {
        friendshipService.deleteFriendship(userID1, userID2);

    }

    @GetMapping("/getFriendsOfAUser")
    public List<Integer> getFriendsOfAUser(@RequestParam Integer userID)
    {
        return friendshipService.getFriendsOfAUser(userID);

    }

    @GetMapping("/getAllFriendships")
    public Map<Integer, List<Integer>> getAllFriendships()
    {
        return friendshipService.getAllFriendships();

    }
}
