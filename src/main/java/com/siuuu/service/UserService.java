package com.siuuu.service;

import com.siuuu.converter.UserConverter;
import com.siuuu.domain.User;
import com.siuuu.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {

    @Autowired
    @Qualifier("userRepo")
    private UserRepository userRepository;

    @Autowired
    @Qualifier("userConverter")
    private UserConverter userConverter;

    public boolean createUser(User user){
        try{
            userRepository.saveAndFlush(user);
            return true;
        }catch(Exception e){
            return false;
        }
    }

}
