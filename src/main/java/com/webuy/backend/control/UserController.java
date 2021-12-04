package com.webuy.backend.control;

import com.webuy.backend.boundary.UserRepository;
import com.webuy.backend.entity.User;
import org.springframework.data.jpa.repository.query.Jpa21Utils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    // standard constructors

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }

    @DeleteMapping("/users")
    void deleteUser(@RequestBody  User user) {
        userRepository.delete(user);
    }

    @DeleteMapping("/users/all")
    void deleteAllUsers() {
        userRepository.deleteAll();
    }
}
