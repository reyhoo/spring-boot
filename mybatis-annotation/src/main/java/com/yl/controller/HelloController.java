package com.yl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(HttpServletRequest request){
        String path = request.getServletContext().getRealPath("/");
        System.err.println(path);
        return "index";
    }
}
