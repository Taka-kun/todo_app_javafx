package com.nisshoku.todo.model;

public class User {

    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String gender;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String firstName, String lastName, String username, String password, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.gender = gender;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
}
