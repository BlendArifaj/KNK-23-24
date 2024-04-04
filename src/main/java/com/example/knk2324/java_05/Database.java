package com.example.knk2324.java_05;

import java.sql.*;

public class Database {
    public static void main(String[] args) throws SQLException {
        String URL = "jdbc:mysql://localhost:3306/knk2024";
        String USER = "root";
        String PASSWORD = "root";
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

        if(connection.isValid(100)){
            System.out.println("Lidhja valide!");
        }

        String sql = "SELECT * FROM users";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while(resultSet.next()){
            int id = resultSet.getInt("id");
            String username = resultSet.getString("username");
            String email = resultSet.getString("email");
            String password = resultSet.getString("password");
            Timestamp createdAt = resultSet.getTimestamp("created_at");

            // Print the retrieved values
            System.out.println("ID: " + id);
            System.out.println("Username: " + username);
            System.out.println("Email: " + email);
            System.out.println("Password: " + password);
            System.out.println("Created At: " + createdAt);
        }

        sql = "SELECT * FROM users WHERE id = ?";
        PreparedStatement statement1 = connection.prepareStatement(sql);
        int userId = 123; // Assuming 123 is the ID you want to query
        statement1.setInt(1, userId); // Set the value of the parameter
        resultSet = statement1.executeQuery();

        connection.close();

//        String URL = "jdbc:mysql://localhost:3306/knk2024";
//        String USER = "root";
//        String PASSWORD = "root";
//
//        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
//
//        if(connection.isValid(100)){
//            System.out.println("Lidhja me bazen e te dhenave u krijua me sukses!");
//        }

    }
}
