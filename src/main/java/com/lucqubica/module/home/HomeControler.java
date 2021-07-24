package com.lucqubica.module.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControler {
    @RequestMapping("/")
    public String getHome(Model model){
        model.addAttribute("name", "Łukasz");
        return "home.html";
    }
}
