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
         Statement statement = connection.createStatement();
        ) {

        System.out.println("Database connected successfully!");
        
        String query1 = "SELECT * FROM jdbc_practice";

        String query2 = "INSERT INTO jdbc_practice (id,name, age) VALUES (5, 'John Doe', 30)";

        String query3 = "UPDATE jdbc_practice SET age = 35 WHERE id = 5";

        String query4 = "DELETE FROM jdbc_practice WHERE id = 4";

        
        // Execute the SQL query and obtain the result set
        //the multiple execution of same statement object closes the previous result set, so we need to execute the queries in order and store the results in separate variables.

        int resultSet2 = statement.executeUpdate(query2);

        int resultSet3 = statement.executeUpdate(query3);

        int resultSet4 = statement.executeUpdate(query4);
        
        //Result set is used to store the result of a SELECT query, while executeUpdate is used for INSERT, UPDATE, and DELETE queries that modify the database but do not return a result set.
        ResultSet resultSet1 = statement.executeQuery(query1);


        //process the result set and print the retrieved data

        //insert
        if (resultSet2 > 0) {
            System.out.println("Data inserted successfully!");
        } else {
            System.out.println("Data insertion failed!");
        }

        //update
        if (resultSet3 > 0) {
            System.out.println("Data updated successfully!");
        } else {
            System.out.println("Data update failed!");
        }

        //delete
        if (resultSet4 > 0) {
            System.out.println("Data deleted successfully!");
        } else {
            System.out.println("Data deletion failed!");
        }

        //select
        while (resultSet1.next()) {
        int id = resultSet1.getInt("id");
        String name = resultSet1.getString("name");
        int age = resultSet1.getInt("age");

        System.out.println(id + " " + name + " " + age);
        }

        //execute():this method is used to execute a SQL statement that may return multiple results, such as a SELECT query that returns a result set and an update count. It returns a boolean value indicating whether the first result is a ResultSet object or an update count.with this we can perform multiple operations in a single statement execution.
        

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