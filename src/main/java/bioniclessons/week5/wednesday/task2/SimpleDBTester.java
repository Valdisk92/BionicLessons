package bioniclessons.week5.wednesday.task2;

import java.sql.*;

/**
 * Created by Владислав on 05.11.2014.
 */
public class SimpleDBTester {
    public static void main(String[] args) {
        final String mysqlProtocol = "jdbc:mysql://cakehost.mysql.ukraine.com.ua:3306/";
        final String dbName = "cakehost_db";
        final String jdbcURL = mysqlProtocol+dbName;
        final String mysqlDriver = "com.mysql.jdbc.Driver";
        final String query = "SELECT * from Books";
        final String driver = mysqlDriver;
        System.setProperty("jdbc.drivers", driver);
        try (Connection connection = DriverManager.getConnection(jdbcURL, "cakehost_db", "QFpNvKPj")){
            PreparedStatement statement = null;
            ResultSet resultSet = null;
            try {
                statement = connection.prepareStatement(query);
                resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    System.out.println("Title: " + resultSet.getString("Title"));
                    System.out.println("Author: " + resultSet.getString("Author"));
                    System.out.println("Year: " + resultSet.getString("Year"));
                    System.out.println("********************************");

                }
            } catch (SQLException se) {
                System.out.println("SQL error: " + se);
            }

        } catch (SQLException e) {
            System.out.println("Connection faild: " + e);
        }
    }
}
