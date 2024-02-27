package secondapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Naveen
 */

public class DatabaseConnector {
    private static final String URL = "jdbc:mysql://sql6.freemysqlhosting.net/sql6687229";
    private static final String USERNAME = "sql6687229";
    private static final String PASSWORD = "HcsUZCcGaZ";
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
    
}
