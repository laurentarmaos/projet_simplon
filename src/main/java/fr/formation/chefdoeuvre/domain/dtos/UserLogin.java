package fr.formation.chefdoeuvre.domain.dtos;

import javax.validation.constraints.NotBlank;

public class UserLogin {

    @NotBlank
    private String userName;

    @NotBlank
    private String userPassword;

    public UserLogin() {

    }

    public String getUserName() {
	return userName;
    }

    public String getUserPassword() {
	return userPassword;
    }

}
