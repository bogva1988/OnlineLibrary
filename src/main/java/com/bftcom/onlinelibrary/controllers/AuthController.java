package com.bftcom.onlinelibrary.controllers;

import com.bftcom.onlinelibrary.interfaces.services.IAuthService;
import com.bftcom.onlinelibrary.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {

    private final IAuthService authService;

    public AuthController(IAuthService authService) {
        this.authService = authService;
    }

    @GetMapping("/checkAccess")
    @ResponseBody
    public boolean checkAccess(@RequestParam String login, @RequestParam String password) {
        return authService.checkAccess(login, password);
    }

    @GetMapping("/register")
    @ResponseBody
    public User register(@RequestParam User user) {
        return authService.register(user);
    }
}
