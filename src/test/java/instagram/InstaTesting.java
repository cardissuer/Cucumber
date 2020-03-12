package instagram;

import java.util.Arrays;

public class InstaTesting {

    public static void main(String[] args) {

        Instagram instagram = new Instagram();

        // SignUp page
        //Users must provide their age, name, username etc

        InstagramUser user1 = new InstagramUser("John Wick", 43, "johnnyW");
        instagram.addUser(user1);
        InstagramUser user2 = new InstagramUser("James Bond", 54, "james");
        instagram.addUser(user2);
        instagram.seeAllUsers();
    }
}