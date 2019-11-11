package com.siuuu.service;

import com.siuuu.domain.Person;

import java.util.List;

public interface PersonService {

    List<Person> findAll();
    boolean save(Person person);
    boolean findByUserForLogin(String username, String password);
}
