package com.siuuu.service;

import com.siuuu.domain.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    boolean save(User user);
    User findByUserForLogin(String username, String password);

}