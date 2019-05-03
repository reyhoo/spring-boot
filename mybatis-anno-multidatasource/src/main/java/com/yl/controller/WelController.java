package com.yl.controller;


import com.yl.mapper.test1.Role1Mapper;
import com.yl.mapper.test2.Role2Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelController {




    @Autowired
    private Role1Mapper role1Mapper;

    @Autowired
    private Role2Mapper role2Mapper;
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("roleList1",role1Mapper.selectAll());
        model.addAttribute("roleList2",role2Mapper.selectAll());
        return "index";
    }
}
