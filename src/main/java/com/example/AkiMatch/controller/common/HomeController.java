package com.example.AkiMatch.controller.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home"; // templates/home.html を返す
    }

    @GetMapping("/about")
    public String about() {
        return "about"; // templates/about.html を返す
    }
}
