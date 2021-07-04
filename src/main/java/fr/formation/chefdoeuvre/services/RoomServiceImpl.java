package fr.formation.chefdoeuvre.services;

import org.springframework.stereotype.Service;

import fr.formation.chefdoeuvre.domain.dtos.RoomCreate;
import fr.formation.chefdoeuvre.domain.entities.Category;
import fr.formation.chefdoeuvre.domain.entities.Hotel;
import fr.formation.chefdoeuvre.domain.entities.Room;
import fr.formation.chefdoeuvre.repositories.CategoryRepository;
import fr.formation.chefdoeuvre.repositories.HotelRepository;
import fr.formation.chefdoeuvre.repositories.RoomRepository;

@Service
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepo;

    private final CategoryRepository categoryRepo;

    private final HotelRepository hotelRepo;

    public RoomServiceImpl(RoomRepository roomRepo, CategoryRepository categoryRepo, HotelRepository hotelRepo) {

	this.roomRepo = roomRepo;
	this.categoryRepo = categoryRepo;
	this.hotelRepo = hotelRepo;
    }

    @Override
    public void createRoom(RoomCreate dto) {

	Room entity = new Room();

	entity.setRoomSize(dto.getRoomSize());
	entity.setRoomFloor(dto.getRoomFloor());
	entity.setRoomNb(dto.getRoomNb());

	String hotelName = dto.getHotelName();
	Hotel hotel = hotelRepo.findByHotelName(hotelName).get();
	entity.setHotelId(hotel);

	String categoryName = dto.getCategoryName();
	Category category = categoryRepo.findByCategoryName(categoryName).get();
	entity.setCategoryId(category);

	entity.setRoomName(hotelName + "-" + dto.getRoomNb());

	roomRepo.save(entity);
    }

}
