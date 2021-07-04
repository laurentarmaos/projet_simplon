package fr.formation.chefdoeuvre.validation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target(TYPE)
@Constraint(validatedBy = { UniqueRoomNameValidator.class })
public @interface UniqueRoomName {

    String message() default "le nom de chambre doit être unique";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
