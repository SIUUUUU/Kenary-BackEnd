package com.siuuu.repository;

import com.siuuu.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    public User findByUUsernameAndUPassword(String username, String password);

}
