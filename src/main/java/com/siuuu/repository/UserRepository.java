package com.siuuu.repository;

import com.siuuu.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface UserRepository extends JpaRepository<Person, Long> {

    public abstract Person findByUUsernameAAndUPassword (String username, String password);

}
