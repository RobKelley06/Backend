package com.firstAngularApp.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.firstAngularApp.CreateAccount;

@RestController
public class CreateAccountController {

	@CrossOrigin(origins = "http://localhost:3000")

    @GetMapping("/createAccount")
    public String index(@RequestParam(value="username") String username, @RequestParam(value="password") String password, @RequestParam(value="cpassword") String cpassword, @RequestParam(value="email", defaultValue="none@none.com") String email, @RequestParam(value="cemail", defaultValue="none@none.com") String cemail) {
		CreateAccount c = new CreateAccount();
        return c.createAccount(username, password, cpassword, email, cemail);
    }

}