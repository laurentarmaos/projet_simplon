package fr.formation.chefdoeuvre.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.chefdoeuvre.domain.entities.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {

    boolean existsByRoomName(String roomName);

    Optional<Room> findByRoomName(String roomName);

}
