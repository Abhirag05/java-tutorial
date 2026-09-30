package com.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {

        String url = requireEnvironmentVariable("DB_URL");
        String username = requireEnvironmentVariable("DB_USERNAME");
        String password = requireEnvironmentVariable("DB_PASSWORD");

        try (Connection connection = DriverManager.getConnection(url, username, password)) {

            System.out.println("Database connected successfully!");
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