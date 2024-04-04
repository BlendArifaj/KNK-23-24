package database;

import com.example.knk2324.java_05.ConnectionUtil;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/knk2024";
        String user = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(
          url, user, password
        );

        if(connection.isValid(1000)){
            System.out.println("Lidhja me baze te te dhenave u krijuar me sukses!");
        }
        String sql = "SELECT * FROM users";
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(sql);
        while(result.next()){
            int id = result.getInt("id");
//            String firstName = result.getString("first_name");
//            String lastName = result.getString("last_name");
            String username = result.getString("username");
            System.out.println("Id: " + id);
            System.out.println("Username: " + username);
//            System.out.println("First name: " + firstName);
//            System.out.println("Last name: " + lastName);

        }


        lexoPerdoruesin("1; 0 = 0;");

    }

    public static void lexoPerdoruesin(String id) throws SQLException{
        String sql = "SELECT * FROM users WHERE id = ?";
        System.out.println(sql);
        Connection connection = DatabaseUtil.getConnection();
//        Statement statement = connection.createStatement();
        PreparedStatement statement = connection.prepareStatement(
               sql
        );
        statement.setString(1, id);
        ResultSet result = statement.executeQuery();
        while(result.next()){
//            int rId = result.getInt("id");
//            String rUsername = result.getString("username");
//
//            System.out.println("Id: " + rId);
//            System.out.println("Id: " + rUsername);
            User user = User.getInstanceFromResultSet(result);
            user.printoDetajet();
        }
    }
}

class User {
    private int id;
    private String username;

    private User(int id, String username){
        this.id = id;
        this.username = username;
    }

    public static User getInstanceFromResultSet(ResultSet resultSet){
        try{
            int id = resultSet.getInt("id");
            String username = resultSet.getString("username");
            return new User(id, username);
        }catch (Exception e){
            return null;
        }
    }

    public void printoDetajet(){
        System.out.println("Id: " + this.id);
        System.out.println("Username: " + this.username);
    }
}