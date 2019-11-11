package com.siuuu.controller;

import com.siuuu.domain.Person;
import com.siuuu.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/person")
    public boolean newUser(@RequestBody @Valid Person person){
        return personService.save(person);
    }
}
