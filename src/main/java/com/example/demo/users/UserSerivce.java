package com.example.demo.users;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserSerivce {
    private final UserRepository userRepository;

    @Autowired
    public UserSerivce(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }
    public User addUsers(User user) {
        var save =  userRepository.save(user);
        return save;
    }

    public void deleteById(int i) {
    }

    public Optional<User> findById(Long id) {
        return this.userRepository.findById(id);
    }

    public User create(User resource) {
        return this.userRepository.save(resource);
    }

}
