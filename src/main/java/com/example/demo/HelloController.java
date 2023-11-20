package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;
import java.util.ArrayList;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        Connection connection = DBConnection.getConnection();

        String query = "SELECT *\n" +
        "FROM users;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();

            ResultSetMetaData metaData = rs.getMetaData();

            String str = "";

            while(rs.next()) {
                int columnNum = metaData.getColumnCount();

                for (int i = 1; i <= columnNum; i++) {
                    str += rs.getString(i) + ", ";
                }
            }

            return str;
        } catch (SQLException e) {
            e.printStackTrace();
            return "Happy Birthday!";
        }
    }

}