package fr.formation.chefdoeuvre.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.chefdoeuvre.domain.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByDefaultRoleTrue();

}
