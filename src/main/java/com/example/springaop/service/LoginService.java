package com.example.springaop.service;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Service
public class LoginService {

    public void login(String name, HttpServletResponse resp) throws IOException {
        resp.getWriter().write("hello " + name);
    }
}
