package com.siuuu.repository;

import com.siuuu.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

    public boolean findByUUsernameAAndUPassword (String username, String password);

}
