package com.siuuu.service;

import com.siuuu.domain.User;
import com.siuuu.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public boolean save(User user){
        try{
            userRepository.save(user);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public User findUserById(Long Id){
        return userRepository.findByCUser(Id);
    }

    @Override
    public User findByUserForLogin(String username, String password) {
        return userRepository.findByUUsernameAndUPassword(username, password);
    }

    @Override
    public User findSessionsByUser(String username){
        return userRepository.findByUUsername(username);
    }

    @Override
    public void remove(User user){
        userRepository.delete(user);
    }

    @Override
    public boolean modifyUser(User user){
        try {
            userRepository.save(user);
            return true;
        } catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

}
