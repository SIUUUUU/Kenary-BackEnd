package com.siuuu.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MainController {
    //This function inits the project
    public static void main(String args[]){
        SpringApplication.run(MainController.class, args);
    }
    //This function inits the project
}
