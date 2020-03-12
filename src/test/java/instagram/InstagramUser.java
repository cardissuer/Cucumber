package instagram;

import java.util.ArrayList;
import java.util.List;

public class InstagramUser {

    String name;
    String username;
    List<Post> posts;
    int numberOfPosts;
    int age;

    public InstagramUser(String name, int age, String username){
        this.name = name;
        this.age = age;
        this.username = username;
        this.posts = new ArrayList<>();
    }
}
