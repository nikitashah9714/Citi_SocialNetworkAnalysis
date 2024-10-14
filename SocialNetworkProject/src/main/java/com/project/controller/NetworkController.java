package com.project.controller;

import com.project.service.FriendshipService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private final static Logger log = LoggerFactory.getLogger(NetworkController.class);

    @GetMapping("/getCentralityOfUser")
    public Integer getCentralityOfUser(@RequestParam Integer userID)
    {
        List<Integer> centralityList = friendshipService.getFriendsOfAUser(userID);
        log.info("Degree Centrality of user"+ userID + "is" + centralityList.size());
        return centralityList.size();

    }
}
