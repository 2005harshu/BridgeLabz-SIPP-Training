package socialmediafriend;
import java.util.*;
public class SocialMediaFriendSystem {
    private UserNode head;

    // Add new user
    public void addUser(int userId, String name, int age) {
        UserNode newNode = new UserNode(userId, name, age);
        if (head == null) {
            head = newNode;
        } else {
            UserNode temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }

    // Search by ID
    private UserNode searchById(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    // Search by Name
    public UserNode searchByName(String name) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) return temp;
            temp = temp.next;
        }
        return null;
    }

    // Add Friend
    public void addFriend(int id1, int id2) {
        UserNode user1 = searchById(id1);
        UserNode user2 = searchById(id2);
        if (user1 != null && user2 != null) {
            if (!user1.friendIds.contains(id2)) user1.friendIds.add(id2);
            if (!user2.friendIds.contains(id1)) user2.friendIds.add(id1);
            System.out.println("Friend connection added.");
        } else {
            System.out.println("User(s) not found.");
        }
    }

    // Remove Friend
    public void removeFriend(int id1, int id2) {
        UserNode user1 = searchById(id1);
        UserNode user2 = searchById(id2);
        if (user1 != null && user2 != null) {
            user1.friendIds.remove(Integer.valueOf(id2));
            user2.friendIds.remove(Integer.valueOf(id1));
            System.out.println("Friend connection removed.");
        } else {
            System.out.println("User(s) not found.");
        }
    }

    // Display Friends
    public void displayFriends(int userId) {
        UserNode user = searchById(userId);
        if (user != null) {
            System.out.println("Friends of " + user.name + ":");
            for (int fid : user.friendIds) {
                UserNode f = searchById(fid);
                if (f != null) {
                    System.out.println("- " + f.name + " (ID: " + f.userId + ")");
                }
            }
        } else {
            System.out.println("User not found.");
        }
    }

    // Count Friends
    public void countFriends(int userId) {
        UserNode user = searchById(userId);
        if (user != null) {
            System.out.println(user.name + " has " + user.friendIds.size() + " friend(s).");
        } else {
            System.out.println("User not found.");
        }
    }

    // Find Mutual Friends
    public void findMutualFriends(int id1, int id2) {
        UserNode user1 = searchById(id1);
        UserNode user2 = searchById(id2);
        if (user1 != null && user2 != null) {
            Set<Integer> mutual = new HashSet<>(user1.friendIds);
            mutual.retainAll(user2.friendIds);

            System.out.println("Mutual Friends between " + user1.name + " and " + user2.name + ":");
            if (mutual.isEmpty()) {
                System.out.println("No mutual friends.");
            } else {
                for (int id : mutual) {
                    UserNode mutualFriend = searchById(id);
                    System.out.println("- " + mutualFriend.name + " (ID: " + mutualFriend.userId + ")");
                }
            }
        } else {
            System.out.println("User(s) not found.");
        }
    }

    // Print all users
    public void displayAllUsers() {
        UserNode temp = head;
        while (temp != null) {
            System.out.println("ID: " + temp.userId + ", Name: " + temp.name + ", Age: " + temp.age);
            temp = temp.next;
        }
    }
}

