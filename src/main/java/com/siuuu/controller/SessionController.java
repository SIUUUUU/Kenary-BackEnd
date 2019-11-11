package com.siuuu.controller;

import com.siuuu.domain.Session;
import com.siuuu.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Controller
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @GetMapping("/sessions")
    public List<Session> searchAll(){
        return sessionService.findAll();
    }

}
