package com.assignment.one.model;

import java.util.Arrays;

public class User {
    private String name;
    private String email;
    private String phone;
    private String address;
    private String gender;
    private String[] hobbies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", email=" + email + ", phone=" + phone +
               ", address=" + address + ", gender=" + gender +
               ", hobbies=" + Arrays.toString(hobbies) + "]";
    }
}
