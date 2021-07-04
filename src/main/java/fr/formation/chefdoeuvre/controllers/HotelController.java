package fr.formation.chefdoeuvre.controllers;

import javax.validation.Valid;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.chefdoeuvre.domain.dtos.HotelCreate;
import fr.formation.chefdoeuvre.services.HotelService;

@RestController
@RequestMapping("/rezhotel")
public class HotelController {

    private final HotelService service;

    public HotelController(HotelService service) {
	this.service = service;
    }

    @PostMapping("/create-hotel")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public void createHotel(@Valid @RequestBody HotelCreate dto) {
	service.createHotel(dto);
    }
}
