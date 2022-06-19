package com.screens.babilo.service;

import com.screens.babilo.dataentity.User;

import java.util.Optional;

public interface UserService {

    public void addUser(User user);

    Optional<User> checkLogin(String emailId, String password);
}
