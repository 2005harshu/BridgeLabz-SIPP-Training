package socialmediafriend;

public class Main {
    public static void main(String[] args) {
        SocialMediaFriendSystem smfs = new SocialMediaFriendSystem();

        smfs.addUser(1, "Alice", 24);
        smfs.addUser(2, "Bob", 22);
        smfs.addUser(3, "Charlie", 23);
        smfs.addUser(4, "David", 25);

        smfs.addFriend(1, 2);
        smfs.addFriend(1, 3);
        smfs.addFriend(2, 3);
        smfs.addFriend(3, 4);

        smfs.displayFriends(1);
        smfs.countFriends(3);

        smfs.findMutualFriends(1, 2);
        smfs.removeFriend(1, 2);

        smfs.displayFriends(1);
        smfs.findMutualFriends(1, 2);

        smfs.displayAllUsers();
    }
}
