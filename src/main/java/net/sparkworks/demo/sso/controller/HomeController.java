package net.sparkworks.demo.sso.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;


@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String home(Principal principal, Model model) {
        model.addAttribute("roles", SecurityContextHolder.getContext().getAuthentication().getAuthorities());
        return "index";
    }
}
