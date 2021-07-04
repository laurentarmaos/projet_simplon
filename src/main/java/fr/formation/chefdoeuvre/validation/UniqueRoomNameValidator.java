package fr.formation.chefdoeuvre.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import fr.formation.chefdoeuvre.domain.dtos.RoomCreate;
import fr.formation.chefdoeuvre.repositories.RoomRepository;

public class UniqueRoomNameValidator implements ConstraintValidator<UniqueRoomName, RoomCreate> {

    private final RoomRepository roomRepo;

    public UniqueRoomNameValidator(RoomRepository roomRepo) {
	this.roomRepo = roomRepo;
    }

    @Override
    public boolean isValid(RoomCreate value, ConstraintValidatorContext context) {

	String roomName = value.getHotelName() + "-" + value.getRoomNb();

	return !roomRepo.existsByRoomName(roomName);
    }

}
