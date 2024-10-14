package com.project.service;

import com.project.model.User;

import java.util.List;
import java.util.Map;

public interface FriendshipService {

    public abstract void createFriendship(Integer userID1, Integer userID2);
    public abstract void deleteFriendship(Integer userID1, Integer userID2);
    public abstract List<Integer> getFriendsOfAUser(Integer userID);
    public abstract Map<Integer, List<Integer>> getAllFriendships();
}
