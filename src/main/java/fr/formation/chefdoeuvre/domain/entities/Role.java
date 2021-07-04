package fr.formation.chefdoeuvre.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role extends AbstractEntity {

    @Column(name = "role_name", nullable = false)
    private String role;

    @Column(name = "role_default", nullable = false)
    private boolean defaultRole;

    public Role() {

    }

    public String getRole() {
	return role;
    }

    public void setRole(String role) {
	this.role = role;
    }

    public boolean isDefaultRole() {
	return defaultRole;
    }

    public void setDefaultRole(boolean defaultRole) {
	this.defaultRole = defaultRole;
    }

}