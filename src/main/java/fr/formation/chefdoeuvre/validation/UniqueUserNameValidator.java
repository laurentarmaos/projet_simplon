package fr.formation.chefdoeuvre.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import fr.formation.chefdoeuvre.repositories.UserRepository;

public class UniqueUserNameValidator implements ConstraintValidator<UniqueUserName, String> {

    private final UserRepository userRepo;

    public UniqueUserNameValidator(UserRepository userRepo) {
	this.userRepo = userRepo;
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

	if (value == null) {
	    return true;
	}
	return !userRepo.existsByUserName(value);
    }

}
