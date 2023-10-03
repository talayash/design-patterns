package creationDesignPatterns.simpleFactory;

import creationDesignPatterns.simpleFactory.pojo.Admin;
import creationDesignPatterns.simpleFactory.pojo.Member;
import creationDesignPatterns.simpleFactory.pojo.User;
import creationDesignPatterns.simpleFactory.pojo.Veteran;

public class UserFactory {

    public static User createUser(String type) {
        return switch (type) {
            case "admin" -> new Admin();
            case "veteran" -> new Veteran();
            case "member" -> new Member();
            default -> throw new IllegalArgumentException("Type is unknown.");
        };
    }
}
