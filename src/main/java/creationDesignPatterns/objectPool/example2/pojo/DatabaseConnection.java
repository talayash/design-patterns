package creationDesignPatterns.objectPool.example2.pojo;

public class DatabaseConnection {
    private boolean isInUse;
    private final int connectionId;

    public DatabaseConnection(int id) {
        isInUse = false;
        connectionId = id;
        // Simulate expensive initialization (e.g., opening a database connection)
        System.out.println("Created a new database connection.");
    }

    public void connect() {
        System.out.println("Connected to the database.");
        isInUse = true;
    }

    public void disconnect() {
        System.out.println("Disconnected from the database.");
        isInUse = false;
    }

    public boolean isInUse() {
        return isInUse;
    }

    public int getConnectionId() {
        return connectionId;
    }
}

