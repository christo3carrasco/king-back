package com.king.burgos.app.security.auth;

import com.king.burgos.app.security.config.JwtService;
import com.king.burgos.app.security.user.Role;
import com.king.burgos.app.security.user.User;
import com.king.burgos.app.security.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    public AuthenticationResponse signup(SignupRequest request) {
        var user = User.builder()
                .dni(request.getDni()).firstname(request.getFirstname()).lastname(request.getLastname())
                .phone(request.getPhone()).birth(request.getBirth()).gender(request.getGender())
                .email(request.getEmail()).password(passwordEncoder.encode(request.getPassword()))
                .status(1).role(Role.ROLE_USER).build();
        userRepository.save(user);
        var token = jwtService.generateToken(user);
        return AuthenticationResponse.builder().token(token).build();
    }

    public AuthenticationResponse signin(SigninRequest request) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
        var user = userRepository.findByEmail(request.getEmail()).orElseThrow();
        var token = jwtService.generateToken(user);
        return AuthenticationResponse.builder().token(token).build();
    }
}
