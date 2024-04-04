# Database

# Lidhja me baze te te dhenave 
```java
public class ConnectionUtil {
    private static Connection connection;
    private static final String URL = "jdbc:mysql://localhost:3306/knk2023";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    public static Connection getConnection() throws SQLException {
        if(connection == null || connection.isClosed()){
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        }

        return connection;

    }
}
```
