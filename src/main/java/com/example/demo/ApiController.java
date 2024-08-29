package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiController {

    @GetMapping("/api/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World dsfsdfd") String name) {
        return String.format("Hello %s!", name);
    }
}
