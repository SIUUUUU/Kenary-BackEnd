package com.siuuu.controller;

import com.siuuu.domain.Session;
import com.siuuu.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @GetMapping("/sessionByTopic/{topic}")
    public List<Session> searchByTopic(@PathVariable String topic){
        return sessionService.sessionOfTopic(topic);
    }

    @GetMapping("/sessionBySubject/{subject}")
    public List<Session> searchBySubject(@PathVariable String subject){
        return sessionService.sessionOfSubject(subject);
    }

    @GetMapping("/sessionByCity/{place}")
    public List<Session> searchByPlace(@PathVariable String place){
        return sessionService.sessionOnPlace(place);
    }

    @GetMapping("/sessionByCity/{city}")
    public List<Session> searchByCity(@PathVariable String city){
        return sessionService.sessionOnCity(city);
    }

    @GetMapping("/sessions")
    public List<Session> searchAll(){
        return sessionService.findAll();
    }

}
