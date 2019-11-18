package com.siuuu.repository;

import com.siuuu.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    public Person findByUUsernameAndUPassword(String username, String password);

}
