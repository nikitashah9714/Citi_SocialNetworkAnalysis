package com.project.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class FriendshipRepository {

    private Map<Integer, List<Integer>> friendshipMap = new HashMap<>();

    public void createFriendship(Integer userID1, Integer userID2) {
        friendshipMap.computeIfAbsent(userID1, u -> new ArrayList<>()).add(userID2);
        friendshipMap.computeIfAbsent(userID2, u -> new ArrayList<>()).add(userID1);
    }

    public void deleteFriendship(Integer userID1, Integer userID2) {
        friendshipMap.getOrDefault(userID1, new ArrayList<>()).remove(userID2);
        friendshipMap.getOrDefault(userID2, new ArrayList<>()).remove(userID1);
    }

    public List<Integer> getFriendsOfAUser(Integer userID) {
        return friendshipMap.getOrDefault(userID, new ArrayList<>());
    }

    public Map<Integer, List<Integer>> getAllFriendships() {
        return friendshipMap;
    }
}
