package fr.formation.chefdoeuvre.services;

import fr.formation.chefdoeuvre.domain.dtos.UserCreate;
import fr.formation.chefdoeuvre.domain.dtos.UserLogin;
import fr.formation.chefdoeuvre.security.IdToken;

public interface UserService {

    void createUser(UserCreate user);

    IdToken login(UserLogin dto);

}
