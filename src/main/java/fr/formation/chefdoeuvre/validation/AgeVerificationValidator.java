package fr.formation.chefdoeuvre.validation;

import java.time.LocalDate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeVerificationValidator implements ConstraintValidator<AgeVerification, LocalDate> {

    @Override
    public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
	if (value == null) {
	    return false;
	}

	LocalDate dateNow = LocalDate.now();

	return (dateNow.minusYears(18).isAfter(value) || dateNow.minusYears(18).isEqual(value));

    }

}
