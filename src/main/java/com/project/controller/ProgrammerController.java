package com.project.controller;

import com.project.model.Programmer;
import com.project.repository.ProgrammerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProgrammerController {

    @Autowired
    ProgrammerRepository repository;

    @RequestMapping("/")
    public String home() {

        return "home.jsp";

    }

    @RequestMapping("/addProgrammer")
    public String addProgrammer(Programmer programmer) {

        repository.save(programmer);
        return "home.jsp";

    }

}
