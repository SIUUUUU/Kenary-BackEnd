package com.siuuu.controller;

import com.siuuu.domain.User;
import com.siuuu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @PutMapping("/user")
    public boolean newUser(@RequestBody @Valid User user){
        return userService.createUser(user);
    }
}
