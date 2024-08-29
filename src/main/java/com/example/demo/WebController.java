package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.spring6.view.ThymeleafView;

import com.example.demo.users.User;
import com.example.demo.users.UserSerivce;

@Controller
public class WebController {
    private final UserSerivce userService;
    
    public WebController(UserSerivce userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String index(@RequestParam(value = "name", defaultValue = "World") String name, Model model) {
        String msg = "Welcome to Thymeleaf Template";
        List<User> list = this.userService.getUsers();
        model.addAttribute("message", msg);
        model.addAttribute("users", list);
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About Us");
        return "about"; // This refers to src/main/resources/templates/about.html
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("title", "Contact Us");
        return "contact"; // This refers to src/main/resources/templates/contact.html
    }
}
