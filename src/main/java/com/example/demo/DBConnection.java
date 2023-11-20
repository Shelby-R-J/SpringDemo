package com.example.demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() {
        Connection connection = null;
        try {
            String password = System.getenv("DB_PASSWORD");
            connection = DriverManager.getConnection("jdbc:postgresql://dpg-clcjgad4lnec73ckq67g-a.ohio-postgres.render.com:5432/testdb_4emv", "root", password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println(connection);

        return connection;
    }
}
