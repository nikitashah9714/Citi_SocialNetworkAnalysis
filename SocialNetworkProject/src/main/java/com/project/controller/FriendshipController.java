package com.project.controller;

import com.project.service.FriendshipService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private final static Logger log = LoggerFactory.getLogger(FriendshipController.class);

    @PostMapping("/createFriendship")
    public void createFriendship(@RequestParam Integer userID1, Integer userID2)
    {
        log.info("Creating Friendship of users");
        friendshipService.createFriendship(userID1, userID2);

    }

    @PostMapping("/deleteFriendship")
    public void deleteFriendship(@RequestParam Integer userID1, Integer userID2)
    {
        log.info("Deleting Friendship of users");
        friendshipService.deleteFriendship(userID1, userID2);

    }

    @GetMapping("/getFriendsOfAUser")
    public List<Integer> getFriendsOfAUser(@RequestParam Integer userID)
    {
        log.info("Fetching all Friendship of user : " + userID);
        return friendshipService.getFriendsOfAUser(userID);

    }

    @GetMapping("/getAllFriendships")
    public Map<Integer, List<Integer>> getAllFriendships()
    {
        log.info("Fetching all Friendship ");
        return friendshipService.getAllFriendships();

    }
}
