package com.king.burgos.app.security.demo;

import com.king.burgos.app.security.user.User;
import com.king.burgos.app.security.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/user")
@RequiredArgsConstructor
public class CustomerController {
    private final UserRepository userRepository;

    @GetMapping(value = "/{email}")
    public Optional<User> getUser(@PathVariable(value = "email") String email) {
        return userRepository.findByEmail(email);
    }
}
