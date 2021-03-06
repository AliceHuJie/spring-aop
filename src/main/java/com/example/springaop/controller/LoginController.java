package com.example.springaop.controller;


import com.example.springaop.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;


    @RequestMapping("/test")
    public void hello(@RequestParam("name") String name, HttpServletResponse resp) throws IOException {
        loginService.login(name, resp);
    }
}
