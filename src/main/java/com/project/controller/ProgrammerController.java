package com.project.controller;

import com.project.model.Programmer;
import com.project.repository.ProgrammerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping("/getProgrammer")
    public ModelAndView getProgrammer(@RequestParam int id) {

        ModelAndView mv = new ModelAndView("displayProgrammer.jsp");
        Programmer programmer = repository.findById(id).orElse(new Programmer());
        mv.addObject(programmer);

        return mv;

    }

}
