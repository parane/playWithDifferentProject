package com.atuts.cartridge.user.service;

import atuts.user.dto.User;
import atuts.user.service.UserService;

public class UserServiceImpl implements UserService{

    @Override
    public User getUser() {
        User user=new User();
        user.setName("Parane");
        return user;
    }
}
