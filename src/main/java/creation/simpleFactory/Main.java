package creation.simpleFactory;

import creation.simpleFactory.pojo.User;
import creation.simpleFactory.pojo.Veteran;

public class Main {

    public static void main(String[] args) {
        User user = UserFactory.createUser("veteran");
        System.out.println(user instanceof Veteran ? ((Veteran) user).print() : null);
    }
}
