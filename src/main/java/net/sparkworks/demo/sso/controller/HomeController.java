package net.sparkworks.demo.sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;


@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String home(Principal principal) {
        return "index";
    }
}
