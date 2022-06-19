package com.screens.babilo.serviceImpl;

import com.screens.babilo.dao.AdminDao;
import com.screens.babilo.dataentity.Admin;
import com.screens.babilo.dataentity.User;
import com.screens.babilo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService {
    
    @Autowired
    private AdminDao adminDao;

    @Override
    public void addAdmin(@NotNull Admin admin) {
       if (adminDao.findByEmailId(admin.getEmailId()).isPresent()) throw new RuntimeException("Error at addAdmin:EmailId already Exist");
       else adminDao.saveAndFlush(admin);
    }

    @Override
    public Optional<Admin> checkLogin(String emailId, String password) {
        if(adminDao.findByEmailId(emailId).isPresent()){
            Optional<Admin> admin = adminDao.findByEmailId(emailId);
            if(admin.get().getPassword().equals(password)){
                return admin;
            }
            else{
                throw new RuntimeException("Username or password is invalid");
            }
        }else{
            throw new RuntimeException("Bad emailId");
        }
    }
}
