package fr.formation.chefdoeuvre.services;

import org.springframework.stereotype.Service;

import fr.formation.chefdoeuvre.domain.dtos.HotelCreate;
import fr.formation.chefdoeuvre.domain.entities.Hotel;
import fr.formation.chefdoeuvre.repositories.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService {

    private final HotelRepository hotelRepo;

    public HotelServiceImpl(HotelRepository hotelRepo) {
	this.hotelRepo = hotelRepo;
    }

    @Override
    public void createHotel(HotelCreate dto) {

	Hotel entity = new Hotel();
	entity.setHotelName(dto.getHotelName());
	entity.setHotelStreetNb(dto.getHotelStreetNb());
	entity.setHotelStreet(dto.getHotelStreet());
	entity.setHotelZipCode(dto.getHotelZipCode());
	entity.setHotelCity(dto.getHotelCity());
	entity.setHotelCountry(dto.getHotelCountry());
	entity.setHotelCapacity(dto.getHotelCapacity());

	hotelRepo.save(entity);
    }

}
