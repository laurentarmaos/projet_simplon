package fr.formation.chefdoeuvre.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.chefdoeuvre.domain.dtos.ReservationCreate;
import fr.formation.chefdoeuvre.services.reservationService;

@RestController
@RequestMapping("/rezhotel")
public class ReservationController {

    private final reservationService service;

    public ReservationController(reservationService service) {
	this.service = service;
    }

    @PostMapping("/reservation")
    public void reservHotel(@Valid @RequestBody ReservationCreate dto) {
	service.reservHotel(dto);
    }
}
