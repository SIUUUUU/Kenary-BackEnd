package com.siuuu.repository;

import com.siuuu.domain.Session;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SessionRepository extends CrudRepository<Session, Long> {

    public List<Session> findBySTopic(String topic);
    public List<Session> findBySSubject(String subject);
    public List<Session> findBySPlace(String place);
    public List<Session> findBySCity(String city);
    //buscar por creador

}
