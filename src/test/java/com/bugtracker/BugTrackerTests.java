package com.bugtracker;


import com.bugtracker.bugtracker.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BugTrackerTests {
    private User createUser(){
        return new User(1, "luis", "ramirez", "dev", "Email@gmail.com", "pass1234");
    }
    @Test
    public void userFullName(){
        User user = createUser();
        Assertions.assertEquals("Luis Ramirez", user.getFullName(), "failed to format full name");
    }

    @Test
    public void lowerCaseEmail(){
        User user = createUser();
        Assertions.assertEquals("email@gmail.com", user.getLowerCaseEmail(), "failed to return lowercase email");
    }
}
