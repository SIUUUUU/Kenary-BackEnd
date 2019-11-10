package com.siuuu.controller;

import com.siuuu.domain.Person;
import com.siuuu.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/")
public class PersonController {

    @Autowired
    @Qualifier("userService")
    private PersonServiceImpl userService;

    @PutMapping("/user")
    public boolean newUser(@RequestBody @Valid Person user){
        return userService.save(user);
    }
}
