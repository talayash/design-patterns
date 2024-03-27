package structural.composite;

import structural.composite.interfaces.User;

import java.util.ArrayList;
import java.util.List;

public class HeadUser implements User {
    // Attributes
    private int id;
    private String userName;
    private List<User> childUsers;

    @Override
    public void print() {
        childUsers.forEach(User::print);
    }

    public void addDepartment(User user) {
        childUsers.add(user);
    }

    public void removeDepartment(User user) {
        childUsers.remove(user);
    }

    // Constructor
    public HeadUser(int id, String userName) {
        this.id = id;
        this.userName = userName;
        this.childUsers = new ArrayList<>();
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

    public List<User> getChildUsers() {
        return childUsers;
    }

    public void setChildUsers(List<User> childDepartments) {
        this.childUsers = childDepartments;
    }
}
