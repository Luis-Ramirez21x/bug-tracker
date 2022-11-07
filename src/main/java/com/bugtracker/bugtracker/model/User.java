package com.bugtracker.bugtracker.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String lastName;
    private String accountType;
    private String email;
    private String password;




    public User(Integer id, String firstName, String lastName, String accountType, String email, String password) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountType = accountType;
        this.email = email;
        this.password = password;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    public String getFullName(){
        String capFirstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);;
        String capLastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);;
        String fullName = capFirstName + " " + capLastName;

        return fullName;
    }

    public String getLowerCaseEmail(){
        return email.toLowerCase();
    }

}
