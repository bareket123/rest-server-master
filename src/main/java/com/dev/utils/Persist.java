package com.dev.utils;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class Persist {

    private Connection connection;


    @PostConstruct
    public void createConnectionToDatabase () {
        try {
            this.connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/project", "root", "1234");
            System.out.println("Successfully connected to DB");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
