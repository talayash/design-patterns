package creationDesignPatterns.simpleFactory;

import creationDesignPatterns.simpleFactory.pojo.User;
import creationDesignPatterns.simpleFactory.pojo.Veteran;

public class Main {

    public static void main(String[] args) {
        User user = UserFactory.createUser("veteran");
        System.out.println(user instanceof Veteran ? ((Veteran) user).print() : null);
    }
}
