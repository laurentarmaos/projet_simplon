package fr.formation.chefdoeuvre.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.chefdoeuvre.domain.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByUserName(String value);

    Optional<User> findByUserName(String value);

}
