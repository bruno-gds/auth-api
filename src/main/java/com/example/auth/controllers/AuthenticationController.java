package com.example.auth.controllers;

import com.example.auth.controllers.dto.user.AuthenticationDTO;
import com.example.auth.controllers.dto.user.RegisterDTO;
import com.example.auth.services.AuthenticationService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("auth")
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/login")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String login(@RequestBody @Valid AuthenticationDTO data) {
        return this.authenticationService.doLogin(data);
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public void register(@RequestBody @Valid RegisterDTO data) {
        this.authenticationService.doRegister(data);
    }
}
