package fr.formation.chefdoeuvre.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import fr.formation.chefdoeuvre.domain.dtos.ReservationCreate;

public class DateSupVerificationValidator implements ConstraintValidator<DateSupVerification, ReservationCreate> {

    @Override
    public boolean isValid(ReservationCreate value, ConstraintValidatorContext context) {

	return (value.getDateEnd().isAfter(value.getDateStart()) || value.getDateStart().isEqual(value.getDateEnd()));
    }

}
