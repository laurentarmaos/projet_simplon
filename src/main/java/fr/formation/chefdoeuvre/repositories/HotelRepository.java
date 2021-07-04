package fr.formation.chefdoeuvre.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.chefdoeuvre.domain.entities.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

    Optional<Hotel> findByHotelName(String hotelName);

}
