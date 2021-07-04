package fr.formation.chefdoeuvre.controllers;

import javax.validation.Valid;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.chefdoeuvre.domain.dtos.UserCreate;
import fr.formation.chefdoeuvre.domain.dtos.UserLogin;
import fr.formation.chefdoeuvre.security.IdToken;
import fr.formation.chefdoeuvre.services.UserService;

@RestController
@RequestMapping("/rezhotel")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
	this.service = service;
    }

    @PostMapping("/create-user")
    public void createUser(@Valid @RequestBody UserCreate user) {

	service.createUser(user);
    }

    @PostMapping("/login")
    public IdToken login(@Valid @RequestBody UserLogin dto) {
	return service.login(dto);
    }

    @GetMapping("/test")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String test() {

	return "admin";
    }

    @GetMapping("/test2")
    @PreAuthorize("hasRole('ROLE_BASIC')")
    public String test2() {

	return "basic";
    }

}
