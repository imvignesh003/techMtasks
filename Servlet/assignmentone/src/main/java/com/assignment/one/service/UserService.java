package com.assignment.one.service;

import com.assignment.one.model.User;
import com.assignment.one.utils.DBConnector;

public class UserService {
    
    public boolean registerUser(User user) {
        DBConnector dbConnector = new DBConnector();
        try {
            dbConnector.connect();
            dbConnector.createTable();
            dbConnector.insertRecord(user);
            System.out.println("User registered successfully: " + user.getName());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                dbConnector.disconnect();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
