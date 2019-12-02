package com.siuuu.controller;

import com.siuuu.domain.User;
import com.siuuu.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class UserControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private UserService userService;

    @Test
    public void givenUsersWhenGetUsersThenReturnJsonArray() throws Exception{

        User tested = new User("mifoto.png", "Marcelo", "Martínez", "marcelo2m97",
                "12345678", "26/10/1997", "El Salvador", "UCA", "Masculino", "Bachiller",
                "Estudiante", "Ingeniería Informática");

        List<User> allUsers = Arrays.asList(tested);

        given(userService.findAll()).willReturn(allUsers);

        mvc.perform(get("/usersList")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
                //.andExpect(jsonPath("$[0].uUsername", is(tested.getuUsername())));
    }
}