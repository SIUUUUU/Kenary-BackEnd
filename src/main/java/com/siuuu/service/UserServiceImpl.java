package com.siuuu.service;

import com.siuuu.domain.Person;
import com.siuuu.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> findAll() {
        return null;
    }

    @Override
    public boolean save(Person person){
        try{
            personRepository.save(person);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Person findByUserForLogin(String username, String password) {
        return personRepository.findByUUsernameAndUPassword(username, password);
    }

}
