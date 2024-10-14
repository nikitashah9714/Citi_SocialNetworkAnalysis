package com.project.controller;

import com.project.service.FriendshipService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/network", produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
public class NetworkController {

    @Autowired
    private FriendshipService friendshipService;

    @GetMapping("/getCentralityOfUser")
    public Integer getCentralityOfUser(@RequestParam Integer userID)
    {
        List<Integer> centralityList = friendshipService.getFriendsOfAUser(userID);
        return centralityList.size();

    }
}
