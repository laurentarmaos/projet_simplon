package fr.formation.chefdoeuvre.services;

import java.util.List;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import fr.formation.chefdoeuvre.domain.dtos.UserCreate;
import fr.formation.chefdoeuvre.domain.dtos.UserLogin;
import fr.formation.chefdoeuvre.domain.entities.Role;
import fr.formation.chefdoeuvre.domain.entities.User;
import fr.formation.chefdoeuvre.repositories.RoleRepository;
import fr.formation.chefdoeuvre.repositories.UserRepository;
import fr.formation.chefdoeuvre.security.BadCredentialsException;
import fr.formation.chefdoeuvre.security.IdToken;
import fr.formation.chefdoeuvre.security.TokenProvider;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepo;
    private final RoleRepository roleRepo;
    private final PasswordEncoder encoder;
    private final TokenProvider provider;

    public UserServiceImpl(UserRepository userRepo, RoleRepository roleRepo, PasswordEncoder encoder,
	    TokenProvider provider) {
	this.userRepo = userRepo;
	this.roleRepo = roleRepo;
	this.encoder = encoder;
	this.provider = provider;
    }

    @Override
    public void createUser(UserCreate dto) {
	User entity = new User();
	entity.setUserName(dto.getUserName());
	entity.setUserBirthDate(dto.getUserBirthDate());

	String pwd = dto.getUserPassword();
	String encodedPwd = encoder.encode(pwd);
	entity.setUserPassword(encodedPwd);

	Role role = roleRepo.findByDefaultRoleTrue();
	entity.setRole(role);

	userRepo.save(entity);
    }

    @Override
    public IdToken login(UserLogin dto) {

	String userName = dto.getUserName();

	User entity = userRepo.findByUserName(userName).orElseThrow(() -> new BadCredentialsException("incorrect ids"));

	String encodedPwd = entity.getUserPassword();
	String pwd = dto.getUserPassword();

	if (!encoder.matches(pwd, encodedPwd)) {
	    throw new BadCredentialsException("incorrect ids");
	}

	List<String> authorities = List.of(entity.getRole().getRole());

	return provider.idToken(entity.getId(), userName, authorities);
    }

}
