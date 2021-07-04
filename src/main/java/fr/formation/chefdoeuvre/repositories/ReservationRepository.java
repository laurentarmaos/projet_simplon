package fr.formation.chefdoeuvre.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.chefdoeuvre.domain.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
