package com.firstAngularApp.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.firstAngularApp.Login;

@RestController
public class LoginController {
	
	@RequestMapping("/login")
    public String index(@RequestParam(value="username") String username, @RequestParam(value="password") String password) {
		Login l = new Login();
        return l.login(username, password);
    }

}