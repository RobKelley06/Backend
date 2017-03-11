package com.firstAngularApp.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Home {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}