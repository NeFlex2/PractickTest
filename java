package com.example.travelcompany;

import com.example.travelcompany.Model.Users;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


public class ExampleUnitTest {


    @org.junit.jupiter.api.Test
    void setName() {
        Users users = new Users("name", "login", "password");
        assertEquals("name", users.getName());
    }

    @org.junit.jupiter.api.Test
    void setPassword() {
        Users users = new Users("name", "login", "password");
        assertEquals("login", users.getLogin());


    }

    @org.junit.jupiter.api.Test
    void setLogin() {
        Users users = new Users("name", "login", "password");
        assertEquals("password", users.getPassword());
    }

    @org.junit.jupiter.api.Test
    void getName() {
        Users users = new Users("name", "login", "password");
        assertEquals("name", users.getName());

    }

    @org.junit.jupiter.api.Test
    void getLogin() {
        Users users = new Users("name", "login", "password");
        assertEquals("password", users.getPassword());
    }

    @org.junit.jupiter.api.Test
    void getPassword() {
        Users users = new Users("name", "login", "password");
        assertEquals("password", users.getPassword());
    }


    
}
