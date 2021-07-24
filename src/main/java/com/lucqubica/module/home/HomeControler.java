package com.lucqubica.module.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeControler {
    @RequestMapping("/")
    public String getHome(Model model){
        model.addAttribute("name", "Łukasz");
        // Object
        PersonDto person = new PersonDto(
                "Lukasz",
                "Kubica",
                5

        );
        model.addAttribute("person", person);

        // lista obiektów
       List<PersonDto> persons = List.of(
                new PersonDto("Marek", "Marek", 105),
                new PersonDto("Anna", "Wanna", 25),
                new PersonDto("Julia", "C", 45)

        );
        model.addAttribute("persons", persons);
        return "home.html";
    }
}
