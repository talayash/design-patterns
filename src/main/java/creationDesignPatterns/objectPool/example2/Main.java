package creationDesignPatterns.objectPool.example2;

import creationDesignPatterns.objectPool.example2.objectPool.ConnectionPool;
import creationDesignPatterns.objectPool.example2.pojo.DatabaseConnection;

public class Main {
    public static void main(String[] args) {
        ConnectionPool connectionPool = new ConnectionPool();

        // Request and use database connections
        DatabaseConnection connection1 = connectionPool.getConnection();
        DatabaseConnection connection2 = connectionPool.getConnection();

        // Release the connections when done
        connectionPool.releaseConnection(connection1);
        connectionPool.releaseConnection(connection2);

        // Reuse the released connections
        DatabaseConnection connection3 = connectionPool.getConnection();
        DatabaseConnection connection4 = connectionPool.getConnection();

        // Clean up and release resources
        connectionPool.releaseConnection(connection3);
        connectionPool.releaseConnection(connection4);
    }
}
