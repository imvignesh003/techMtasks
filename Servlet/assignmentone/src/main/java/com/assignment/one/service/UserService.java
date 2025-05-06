package com.assignment.one.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
    public boolean updateUser(User user) {
        DBConnector dbConnector = new DBConnector();
        try {
            dbConnector.connect();
            String sql = "UPDATE ASSIGNMENTONE SET name=?, phone=?, address=?, gender=? WHERE email=?";
            PreparedStatement preparedStatement = dbConnector.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getPhone());
            preparedStatement.setString(3, user.getAddress());
            preparedStatement.setString(4, user.getGender());
            preparedStatement.setString(5, user.getEmail());
            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("User updated successfully: " + user.getName());
                return true;
            } else {
                System.out.println("User not found with email: " + user.getEmail());
            }
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

    public User getUserByEmail(String email) {
        User user = null;
        DBConnector dbConnector = new DBConnector();
        try {
            dbConnector.connect();
            String sql = "SELECT * FROM ASSIGNMENTONE WHERE email=?";
            PreparedStatement preparedStatement = dbConnector.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, email);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                user = new User();
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                user.setPhone(resultSet.getString("phone"));
                user.setAddress(resultSet.getString("address"));
                user.setGender(resultSet.getString("gender"));
                
            } else {
                System.out.println("User not found with email: " + email);
            }
        } catch (Exception e) { 
            e.printStackTrace();
        } finally {
            try {
                dbConnector.disconnect();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } 
        return user;  
    }

    public boolean deleteUserByEmail(String email) {
        DBConnector dbConnector = new DBConnector();
        try {
            dbConnector.connect();
            String sql = "DELETE FROM ASSIGNMENTONE WHERE email=?";
            PreparedStatement preparedStatement = dbConnector.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, email);
            int rowsDeleted = preparedStatement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("User deleted successfully with email: " + email);
                return true;
            } else {
                System.out.println("User not found with email: " + email);
            }
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
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        DBConnector dbConnector = new DBConnector();
        try {
            dbConnector.connect();
            String sql = "SELECT * FROM ASSIGNMENTONE";
            PreparedStatement preparedStatement = dbConnector.getConnection().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                User user = new User();
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                user.setPhone(resultSet.getString("phone"));
                user.setAddress(resultSet.getString("address"));
                user.setGender(resultSet.getString("gender"));
                users.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                dbConnector.disconnect();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return users;
    }
}
