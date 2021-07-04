package fr.formation.chefdoeuvre.domain.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User extends AbstractEntity {

    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(name = "user_password", nullable = false)
    private String userPassword;

    @Column(name = "user_birthdate", nullable = false)
    private LocalDate userBirthDate;

    @ManyToOne
    @JoinColumn(name = "role", nullable = false)
    private Role role;

    public User() {

    }

    public String getUserName() {
	return userName;
    }

    public void setUserName(String userEmail) {
	this.userName = userEmail;
    }

    public String getUserPassword() {
	return userPassword;
    }

    public void setUserPassword(String userpassword) {
	this.userPassword = userpassword;
    }

    public LocalDate getUserBirthDate() {
	return userBirthDate;
    }

    public void setUserBirthDate(LocalDate userBirthDate) {
	this.userBirthDate = userBirthDate;
    }

    public Role getRole() {
	return role;
    }

    public void setRole(Role role) {
	this.role = role;
    }

}
