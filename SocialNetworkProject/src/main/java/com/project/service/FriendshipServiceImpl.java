package com.project.service;

import com.project.repository.FriendshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class FriendshipServiceImpl implements FriendshipService{

    @Autowired
    private FriendshipRepository friendshipRepository;


    @Override
    public void createFriendship(Integer userID1, Integer userID2) {
        friendshipRepository.createFriendship(userID1, userID2);
    }

    @Override
    public void deleteFriendship(Integer userID1, Integer userID2) {
        friendshipRepository.deleteFriendship(userID1, userID2);
    }

    @Override
    public List<Integer> getFriendsOfAUser(Integer userID) {
        return friendshipRepository.getFriendsOfAUser(userID);
    }

    @Override
    public Map<Integer, List<Integer>> getAllFriendships() {
        return friendshipRepository.getAllFriendships();
    }
}
