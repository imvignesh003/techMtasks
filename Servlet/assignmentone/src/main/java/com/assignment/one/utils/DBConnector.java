package com.assignment.one.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.assignment.one.model.User;

public class DBConnector {
    static String DB_URL_STRING = "jdbc:postgresql://localhost:5432/techM?user=postgres&password=vignesh";
    Connection con;
    public void connect() throws Exception {
        Class.forName("org.postgresql.Driver");
        con = DriverManager.getConnection(DB_URL_STRING);
    }
    public boolean  createTable() throws Exception {
        String sql = "CREATE TABLE IF NOT EXISTS ASSIGNMENTONE (id SERIAL PRIMARY KEY, name VARCHAR(50),email VARCHAR(50),phone VARCHAR(15),address VARCHAR(300), gender VARCHAR(10))";
        return con.createStatement().execute(sql);
    }
    public boolean insertRecord(User user) throws Exception{
        String sql = "INSERT INTO ASSIGNMENTONE (name, email, phone, address, gender) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setString(1, user.getName());
        preparedStatement.setString(2, user.getEmail());
        preparedStatement.setString(3, user.getPhone());
        preparedStatement.setString(4, user.getAddress());
        preparedStatement.setString(5, user.getGender());
        return preparedStatement.executeUpdate() > 0;
    }
    
    public void disconnect() throws Exception {
        if (con != null) {
            con.close();
        }
    }
    public Connection getConnection() {
        return con;
    }
}