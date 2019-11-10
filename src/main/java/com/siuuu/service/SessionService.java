package com.siuuu.service;

import com.siuuu.domain.Session;

import java.util.List;

public interface SessionService {

    List<Session> sessionOfTopic(String topic);
    List<Session> sessionOfSubject(String subject);
    List<Session> sessionOnPlace(String place);
    List<Session> sessionOnCity(String city);

}
