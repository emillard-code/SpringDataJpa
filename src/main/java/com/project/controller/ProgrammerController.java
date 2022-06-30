package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProgrammerController {

    @RequestMapping("/")
    public String home() {
        return "home.jsp";
    }

}
