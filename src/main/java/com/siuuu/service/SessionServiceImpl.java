package com.siuuu.service;

import com.siuuu.domain.Session;
import com.siuuu.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionServiceImpl implements SessionService{

    @Autowired
    private SessionRepository sessionRepository;

    @Override
    public List<Session> sessionOfTopic(String topic) {
        return sessionRepository.findBySTopic(topic);
    }

    @Override
    public List<Session> sessionOfSubject(String subject) {
        return sessionRepository.findBySSubject(subject);
    }

    @Override
    public List<Session> sessionOnPlace(String place) {
        return sessionRepository.findBySPlace(place);
    }

    @Override
    public List<Session> sessionOnCity(String city) {
        return sessionRepository.findBySCity(city);
    }

    @Override
    public List<Session> findAll(){
        return sessionRepository.findAll();
    }
}
