package com.siuuu.repository;

import com.siuuu.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    public User findByUUsernameAndUPassword(String username, String password);
    public User findByUUsername(String username);

}
