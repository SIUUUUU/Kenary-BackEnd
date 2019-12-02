package com.siuuu.controller;

import com.siuuu.domain.Session;
import com.siuuu.domain.User;
import com.siuuu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public boolean newUser(@RequestBody @Valid User user){
        return userService.save(user);
    }

    @GetMapping("/login/{username}/{password}")
    public User searchUser(@PathVariable("username") String username, @PathVariable("password") String password){
        return userService.findByUserForLogin(username, password);
    }

    @GetMapping("/usersList")
    public List<User> usersList(){
        return userService.findAll();
    }

    //@GetMapping("/sessionsOf/{username}")
    //public List<Session> sessionListByUsername(@PathVariable("username") String username){
    //    User user = new User();
    //    user = userService.findSessionsByUser(username);
    //    List<Session> sessions = null;
    //    sessions = user.getuSessions();
    //    return sessions;
    //}

}
