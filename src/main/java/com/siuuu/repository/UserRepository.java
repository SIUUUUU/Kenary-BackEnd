package com.siuuu.repository;

import com.siuuu.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface UserRepository extends JpaRepository<User, Serializable> {

    public abstract User findByUUsernameAAndUPassword (String username, String password);

}
