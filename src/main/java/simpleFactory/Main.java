package simpleFactory;

import simpleFactory.pojo.User;
import simpleFactory.pojo.Veteran;

public class Main {

    public static void main(String args[]) {
        User user = UserFactory.createUser("veteran");
        System.out.println(user instanceof Veteran ? ((Veteran) user).print() : null);
    }
}
