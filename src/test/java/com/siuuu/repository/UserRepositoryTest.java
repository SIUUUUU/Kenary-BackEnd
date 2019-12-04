package com.siuuu.repository;

import static org.junit.jupiter.api.Assertions.*;
import com.siuuu.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void whenFindByUsernameThenReturnUser(){
        User given = new User("mifoto.png", "Marcelo", "Martínez", "marcelo2m97",
                "12345678", "26/10/1997", "El Salvador", "UCA", "Masculino", "Bachiller",
                "Estudiante", "Ingeniería Informática");
        entityManager.persist(given);
        entityManager.flush();

        User when = userRepository.findByUUsername(given.getuUsername());

        assertThat(when.getuUsername()).isEqualTo(given.getuUsername());

    }

    @Test
    public void whenFindByUsernameAndPasswordThenReturnUser(){
        User given = new User("mifoto.png", "Marcelo", "Martínez", "marcelo2m97",
                "12345678", "26/10/1997", "El Salvador", "UCA", "Masculino", "Bachiller",
                "Estudiante", "Ingeniería Informática");
        entityManager.persist(given);
        entityManager.flush();

        User when = userRepository.findByUUsernameAndUPassword(given.getuUsername(), given.getuPassword());
        assertThat(when.getuUsername()).isEqualTo(given.getuUsername());
        assertThat(when.getuPassword()).isEqualTo(given.getuPassword());

    }

    @Test
    public void whenFindByIdThenReturnUser(){
        User given = new User("mifoto.png", "Marcelo", "Martínez", "marcelo2m97",
                "12345678", "26/10/1997", "El Salvador", "UCA", "Masculino", "Bachiller",
                "Estudiante", "Ingeniería Informática");
        entityManager.persist(given);
        entityManager.flush();

        User when = userRepository.findByCUser(given.getcUser());
        assertThat(when.getcUser()).isEqualTo(given.getcUser());
    }
}