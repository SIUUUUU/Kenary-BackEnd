package com.siuuu.repository;

import com.siuuu.domain.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SessionRepository extends JpaRepository<Session, Long> {

    public List<Session> findBySTopic(String topic);
    public List<Session> findBySSubject(String subject);
    public List<Session> findBySPlace(String place);
    public List<Session> findBySCity(String city);

}
