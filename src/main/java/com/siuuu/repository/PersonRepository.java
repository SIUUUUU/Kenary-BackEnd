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
    //@Query(nativeQuery = true, value = "SELECT * FROM public.person WHERE username = :username AND password = :password")
    //public boolean findByUsernameAndPassword (String username, String password);
    //@Query(value = "SELECT * FROM person" ,nativeQuery = true)
    //List<Person> findAllByF();

    public Person findByUsernameAndPassword(String username, String password);
}
