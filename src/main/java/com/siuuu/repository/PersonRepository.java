package com.siuuu.repository;

import com.siuuu.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    public Person findByUUsernameAAndUPassword (String username, String password);

}