# Social Network Project
## Problem Statement
- Develop a social media analysis project to managing users and their friendships.
- Create, Remove, View User.
- Create, Remove, View Friendships between users.
- Calculate the shortest path between two users.
- Calculate degree centrality of users.
- Identify communities within the social network - group of users more densely connected

## NFRs
- Time 120 mins.

## Implementation
1. User Create - with attributes userID, username, email.
2. User Delete - delete user by UserID
3. View User - Get User by userId
4. View All Users - List of all Users
5. Create Friendship - between 2 users
6. Delete Friendship - Between 2 users
7. View All Friends of a User by userID
8. View all users and their friendships
9. Calculate Cardinality of a user - count of all the friends that a user has

# Solution
## Implementation
1. Create User Controller, Service and Repository classes.
2. Create Friendship Controller, Service and Repository classes.
3. Create Network Controller
## How to Run ?
### Pre-requisites:
Tested with:
- Maven
- Java 22 
### Steps:
1. Clone the repository - https://github.com/nikitashah9714/Citi_SocialNetworkAnalysis
2. Run `mvn clean install` to build the project
3. Run `mvn exec:java` to run the project
4. On execution, it will start the application on port 8001


