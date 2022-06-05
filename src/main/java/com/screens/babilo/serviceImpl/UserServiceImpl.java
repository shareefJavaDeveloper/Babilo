package com.screens.babilo.serviceImpl;

import com.screens.babilo.dao.UserDao;
import com.screens.babilo.dataentity.User;
import com.screens.babilo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(@NotNull User user) {
        if (userDao.existsById(user.getUserId())) throw new RuntimeException("Error at addUser:UserId already Exist");
        else userDao.saveAndFlush(user);
    }
}
