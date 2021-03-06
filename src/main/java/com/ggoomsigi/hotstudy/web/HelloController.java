package com.ggoomsigi.hotstudy.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
    // 1. HTTP Method : GET, POST, PUT, DELETE etc ...
    // 2. URL Path : /hello, /hi, /login, /sign-up etc...
    // 3. Do Something

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!");
        return "hello";
    }

    @GetMapping("/hello1")
    public String hello1() { return "hello1"; }
}
