package com.siuuu.service;

import com.siuuu.domain.User;
import com.siuuu.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
class UserServiceImplTest {

    @TestConfiguration
    static class UserServiceImplTestContextConfiguration {

        @Bean
        public UserService userService() {
            return new UserServiceImpl();
        }
    }

    @Autowired
    private UserService userService;

    @MockBean
    private UserRepository userRepository;

    @Before
    public void setUp() {

        User before = new User("mifoto.png", "Marcelo", "Martínez", "marcelo2m97",
                "12345678", "26/10/1997", "El Salvador", "UCA", "Masculino", "Bachiller",
                "Estudiante", "Ingeniería Informática");

        Mockito.when(userRepository.findByUUsername(before.getuUsername()))
            .thenReturn(before);

    }

    @Test
    public void whenValidUsernameThenUserShouldBeFound(){

        String username = "marcelo2m97";
        User found = userService.findSessionsByUser(username);

        assertThat(found.getuUsername()).isEqualTo(username);

    }

}