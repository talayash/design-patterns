package simpleFactory;

import simpleFactory.pojo.Admin;
import simpleFactory.pojo.Member;
import simpleFactory.pojo.User;
import simpleFactory.pojo.Veteran;

public class UserFactory {

    public static User createUser(String type) {
        switch (type) {
            case "admin":
                return new Admin();
            case "veteran":
                return new Veteran();
            case "member":
                return new Member();
            default:
                throw  new IllegalArgumentException("Type is unknown.");
        }
    }
}
