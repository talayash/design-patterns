package creationDesignPatterns.builder.pojo;

public class Admin extends User {

    // Attributes
    private boolean access;

    // Constructor
    public Admin(Builder builder) {
        setAccess(builder.access);
        setId(builder.id);
        setUserName(builder.userName);
        setPassword(builder.password);
    }

    // Getters & Setters
    public boolean isAccess() {
        return access;
    }

    public void setAccess(boolean access) {
        this.access = access;
    }

    // toString
    @Override
    public String toString() {
        return "Admin{" +
                "access=" + access +
                "} " + super.toString();
    }

    // Builder Class
    public static class Builder {
        // Attributes
        private Long id;
        private String userName;
        private String password;
        private boolean access;

        // Builder
        public Admin build() {
            Admin admin = new Admin(this);
            return admin;
        }

        // Setters
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder access(boolean access) {
            this.access = access;
            return this;
        }
    }
}
