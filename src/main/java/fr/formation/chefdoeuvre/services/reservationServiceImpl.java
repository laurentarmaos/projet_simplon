package fr.formation.chefdoeuvre.services;

import org.springframework.stereotype.Service;

import fr.formation.chefdoeuvre.domain.dtos.ReservationCreate;
import fr.formation.chefdoeuvre.domain.entities.Hotel;
import fr.formation.chefdoeuvre.domain.entities.Reservation;
import fr.formation.chefdoeuvre.domain.entities.Room;
import fr.formation.chefdoeuvre.domain.entities.User;
import fr.formation.chefdoeuvre.repositories.HotelRepository;
import fr.formation.chefdoeuvre.repositories.ReservationRepository;
import fr.formation.chefdoeuvre.repositories.RoomRepository;
import fr.formation.chefdoeuvre.repositories.UserRepository;
import fr.formation.chefdoeuvre.security.SecurityHelper;

@Service
public class reservationServiceImpl implements reservationService {

    private final ReservationRepository reservationRepo;
    private final RoomRepository roomRepo;
    private final HotelRepository hotelRepo;
    private final UserRepository userRepo;

    public reservationServiceImpl(ReservationRepository reservationRepo, RoomRepository roomRepo,
	    HotelRepository hotelRepo, UserRepository userRepo) {
	this.reservationRepo = reservationRepo;
	this.roomRepo = roomRepo;
	this.hotelRepo = hotelRepo;
	this.userRepo = userRepo;
    }

    @Override
    public void reservHotel(ReservationCreate dto) {

	Reservation entity = new Reservation();

	entity.setDateStart(dto.getDateStart());
	entity.setDateEnd(dto.getDateEnd());
	entity.setClientFirstName(dto.getClientLastName());
	entity.setClientLastName(dto.getClientFirstName());
	entity.setPaid(false);

	String hotelName = dto.getHotelName();
	Hotel hotel = hotelRepo.findByHotelName(hotelName).get();
	entity.setHotel(hotel);

	String roomName = dto.getRoomName();
	Room room = roomRepo.findByRoomName(roomName).get();
	entity.setRoom(room);

	String resa = String.valueOf(dto.getDateStart().getYear()) + String.valueOf(dto.getDateStart().getMonthValue())
		+ String.valueOf(dto.getDateStart().getDayOfMonth()) + String.valueOf(dto.getDateEnd().getYear())
		+ String.valueOf(dto.getDateEnd().getMonthValue()) + String.valueOf(dto.getDateEnd().getDayOfMonth())
		+ hotel.getId().toString() + room.getRoomNb().toString();
	entity.setReservation(resa);

	Long userId = SecurityHelper.userId();
	User user = userRepo.findById(userId).get();
	entity.setUser(user);

	reservationRepo.save(entity);

    }

}
