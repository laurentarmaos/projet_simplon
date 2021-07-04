package fr.formation.chefdoeuvre.controllers;

import javax.validation.Valid;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.chefdoeuvre.domain.dtos.RoomCreate;
import fr.formation.chefdoeuvre.services.RoomService;

@RestController
@RequestMapping("/rezhotel")
public class RoomController {

    private final RoomService service;

    public RoomController(RoomService service) {
	this.service = service;
    }

    @PostMapping("/create-room")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public void createRoom(@Valid @RequestBody RoomCreate dto) {
	service.createRoom(dto);
    }

}
