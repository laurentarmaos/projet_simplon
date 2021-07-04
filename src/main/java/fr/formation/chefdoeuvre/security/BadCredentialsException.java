package fr.formation.chefdoeuvre.security;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(code = HttpStatus.UNAUTHORIZED)
public class BadCredentialsException extends RuntimeException {

    public BadCredentialsException(String message) {
	super(message);
	System.out.println(message);
    }

}
