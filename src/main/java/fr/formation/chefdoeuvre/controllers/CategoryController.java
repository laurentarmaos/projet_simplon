package fr.formation.chefdoeuvre.controllers;

import javax.validation.Valid;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.chefdoeuvre.domain.dtos.CategoryCreate;
import fr.formation.chefdoeuvre.services.CategoryService;

@RestController
@RequestMapping("/rezhotel")
public class CategoryController {

    private final CategoryService service;

    public CategoryController(CategoryService service) {
	this.service = service;
    }

    @PostMapping("/create-category")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public void createCategory(@Valid @RequestBody CategoryCreate dto) {
	service.createCategory(dto);
    }
}
