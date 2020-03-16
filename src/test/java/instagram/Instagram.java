package instagram;

import utilities.Config;

import java.util.ArrayList;
import java.util.List;

public class Instagram {

    List<InstagramUser> users;

    public Instagram() {
        this.users = new ArrayList<>();
    }

    public void addUser(InstagramUser user) {
        boolean found = false;
        for (InstagramUser u : users) {
            if (u.username.equalsIgnoreCase(user.username)) {
                System.out.println("Username already exists, try again");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("User added to the system");
            users.add(user);
        }
    }

    public void addPost(String userName, Post instaPost) {
        for (InstagramUser u : users) {
            if (u.username.equalsIgnoreCase(userName)) {
                u.posts.add(instaPost);
                return;

            }
            System.out.println("Username" + userName + "wasn't found");
        }
    }

    public void removeUser(String username) {
        for (InstagramUser u : users) {
            if (u.username.equalsIgnoreCase(username)) {
                users.remove(u);
                return;
            }
        }
        System.out.println("Username" + username + "wasn't found");

    }

    public void updateUser(String username, InstagramUser user, String newName, int newAge) {
        for (InstagramUser u : users) {
            if (u.username.equalsIgnoreCase(username)) {
                u.name = newName;
                u.age = newAge;
                System.out.println("User updated");
                return;
            }
        }
        System.out.println("Username" + username + "wasn't updated");
    }

    public void seeAllUsers(String secretkey) {
        if (Config.getProperty("apiKey").equalsIgnoreCase(secretkey)) {
            int counter = 1;
            for (InstagramUser u : users) {
                System.out.println("User" + counter);
                System.out.println("Name:" + u.name);
                System.out.println("Username:" + u.username);
                System.out.println("Age" + u.age);
                counter++;
            }
        } else {
            System.out.println("Invalid API key. Try again");

        }
    }
}