package com.yl.controller;

import org.apache.log4j.Logger;
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
        Logger logger = Logger.getLogger(HelloController.class);
        logger.error("contextPath="+path);
        return "index";
    }
}
