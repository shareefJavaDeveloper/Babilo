package com.screens.babilo.service;

import com.screens.babilo.dataentity.Admin;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface AdminService {

    public void addAdmin(Admin admin);

    Optional<Admin> checkLogin(String emailId, String password);
}
