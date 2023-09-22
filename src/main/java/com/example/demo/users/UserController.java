package com.example.demo.users;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/user")
public class UserController {
    private final UserSerivce userSerivce;

    public UserController(UserSerivce userSerivce) {
        this.userSerivce = userSerivce;
    }

    @GetMapping()
    public List<User> getUsers() {
        return this.userSerivce.getUsers();
    }

     @GetMapping(value = "/{id}")
    public Optional<User> findById(@PathVariable("id") Long id) {
        return this.userSerivce.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@RequestBody User resource) {
        return this.userSerivce.create(resource);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable( "id" ) Long id, @RequestBody User resource) {
        
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
        this.userSerivce.deleteById(1);
    }
}
