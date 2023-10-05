package creation.objectPool.example2.objectPool;

import creation.objectPool.example2.pojo.DatabaseConnection;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
    private static final int MAX_POOL_SIZE = 5;
    private final List<DatabaseConnection> connections;

    public ConnectionPool() {
        System.out.println("Create Pool for size: " + MAX_POOL_SIZE);
        connections = new ArrayList<>();
        for (int i = 0; i < MAX_POOL_SIZE; i++) {
            connections.add(new DatabaseConnection(i));
        }
    }

    public DatabaseConnection getConnection() {
        // Iterate over the pool and find the first open connection
        for (DatabaseConnection connection : connections) {
            if (!connection.isInUse()) {
                connection.connect();
                System.out.println("Connected to ID Number: " + connection.getConnectionId());
                return connection;
            }
        }
        return null;
    }

    public void releaseConnection(DatabaseConnection connection) {
        connection.disconnect();
        System.out.println("Released from ID Number: " + connection.getConnectionId());

    }
}
