package com.siuuu.controller;

import com.siuuu.domain.Person;
import com.siuuu.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/person")
    public boolean newUser(@RequestBody @Valid Person person){
        return personService.save(person);
    }

    @GetMapping("/login/{username}/{password}")
    public Person searchUser(@PathVariable("username") String username, @PathVariable("password") String password){
        return personService.findByUserForLogin(username, password);
    }

    @GetMapping("/chale")
    public List<Person> chale(){
        return personService.findAll();
    }
}
