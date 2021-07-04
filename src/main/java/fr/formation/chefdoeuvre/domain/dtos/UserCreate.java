package fr.formation.chefdoeuvre.domain.dtos;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import fr.formation.chefdoeuvre.validation.AgeVerification;
import fr.formation.chefdoeuvre.validation.Pwdvalidation;
import fr.formation.chefdoeuvre.validation.UniqueUserName;

public class UserCreate {

    @NotBlank
    @Email
    @UniqueUserName
    private String userName;

    @Pwdvalidation
    @NotBlank
    @Size(min = 10)
    private String userPassword;

    @NotNull
    @AgeVerification
    private LocalDate userBirthDate;

    public UserCreate() {
    }

    public String getUserName() {
	return userName;
    }

//    public void setUserName(String userName) {
//	this.userName = userName;
//    }

    public String getUserPassword() {
	return userPassword;
    }

//    public void setUserPassword(String userPassword) {
//	this.userPassword = userPassword;
//    }

    public LocalDate getUserBirthDate() {
	return userBirthDate;
    }

//    public void setUserBirthDate(LocalDate userBirthDate) {
//	this.userBirthDate = userBirthDate;
//    }

    @Override
    public String toString() {
	return "UserCreate [userEmail=" + userName + ", userPassword=PROTECTED, userBirthDate=" + userBirthDate + "]";
    }

}
