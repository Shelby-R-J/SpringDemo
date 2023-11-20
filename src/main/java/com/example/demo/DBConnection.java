package com.example.demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() {

        try {
            FileReader fr = new FileReader("pass.txt");
            BufferedReader bfr = new BufferedReader(fr);
        } catch (FileNotFoundException e) {
            System.out.println("Password file not detected.");
        }

        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://dpg-clcjgad4lnec73ckq67g-a.ohio-postgres.render.com:5432/testdb_4emv", "root", "pMeoYTqhagMAnRItmIe8LgNo0l30o74X");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println(connection);

        return connection;
    }
}
