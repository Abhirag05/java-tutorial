package com.example;

import java.sql.*;//this will import all the classes in the java.sql package, which is necessary for working with JDBC (Java Database Connectivity) to connect to and interact with databases.

public class Main {
    public static void main(String[] args) {

        String url = requireEnvironmentVariable("DB_URL");
        String username = requireEnvironmentVariable("DB_USERNAME");
        String password = requireEnvironmentVariable("DB_PASSWORD");
        
        //we using the resource management feature of Java (try-with-resources) to automatically close the database connection and statement after use. This helps prevent resource leaks and ensures that the resources are properly released.
        try (
        Connection connection = DriverManager.getConnection(url, username, password);
        //creating a Statement object using the connection to execute SQL queries against the database.
         Statement statement = connection.createStatement()
        ) {

        System.out.println("Database connected successfully!");
        
        String sql = "SELECT * FROM jdbc_practice";
        
        // Execute the SQL query and obtain the result set
        ResultSet resultSet = statement.executeQuery(sql);
        
        //process the result set and print the retrieved data
        while (resultSet.next()) {
        int id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        int age = resultSet.getInt("age");

        System.out.println(id + " " + name + " " + age);
        }

    } catch (Exception e) {
    System.out.println("Connection failed!");
    e.printStackTrace();
    }
        
}

    private static String requireEnvironmentVariable(String name) {
        String value = System.getenv(name);
        if (value == null || value.isBlank()) {
            throw new IllegalStateException("Missing environment variable: " + name);
        }
        return value;
    }
}