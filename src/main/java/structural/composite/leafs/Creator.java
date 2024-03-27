package structural.composite.leafs;

import structural.composite.interfaces.User;

public class Creator implements User {
    // Attributes
    private int id;
    private String userName;

    //

    @Override
    public void print() {
        String message = getClass().getSimpleName() + " - " + id + " - " + userName;
        System.out.println(message);
    }

    // Constructor
    public Creator(int id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
