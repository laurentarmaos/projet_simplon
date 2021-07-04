package fr.formation.chefdoeuvre.domain.dtos;

import java.time.LocalDate;

public class UserView {

    private String userName;

    private String userPassword;

    private LocalDate userBirthDate;

    public UserView() {

    }

    public String getUserName() {
	return userName;
    }

    public LocalDate getUserBirthDate() {
	return userBirthDate;
    }

    @Override
    public String toString() {
	return "UserView [userName=" + userName + ", userPassword=PROTECTED, userBirthDate=" + userBirthDate + "]";
    }

}
