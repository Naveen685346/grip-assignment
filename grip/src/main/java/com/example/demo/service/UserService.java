package com.example.demo.service;

public interface UserService {
    void registerUser(String username, String password);
    boolean authenticateUser(String username, String password);
}
