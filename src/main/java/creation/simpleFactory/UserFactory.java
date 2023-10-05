package creation.simpleFactory;

import creation.simpleFactory.pojo.Admin;
import creation.simpleFactory.pojo.Member;
import creation.simpleFactory.pojo.User;
import creation.simpleFactory.pojo.Veteran;

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
