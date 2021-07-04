package fr.formation.chefdoeuvre.domain.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reservations")
public class Reservation extends AbstractEntity {

    @Column(name = "reservation", nullable = false)
    private String reservation;

    @Column(name = "date_start", nullable = false)
    private LocalDate dateStart;

    @Column(name = "date_end", nullable = false)
    private LocalDate dateEnd;

    @Column(name = "client_last_name", nullable = false)
    private String clientLastName;

    @Column(name = "client_first_name", nullable = false)
    private String clientFirstName;

    @Column(name = "is_paid", nullable = false)
    private boolean isPaid;

    @ManyToOne
    @JoinColumn(name = "id_users", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_rooms", nullable = false)
    private Room room;

    @ManyToOne
    @JoinColumn(name = "id_hotels", nullable = false)
    private Hotel hotel;

    public Reservation() {

    }

    public String getReservation() {
	return reservation;
    }

    public void setReservation(String reservation) {
	this.reservation = reservation;
    }

    public LocalDate getDateStart() {
	return dateStart;
    }

    public void setDateStart(LocalDate dateStart) {
	this.dateStart = dateStart;
    }

    public LocalDate getDateEnd() {
	return dateEnd;
    }

    public void setDateEnd(LocalDate dateEnd) {
	this.dateEnd = dateEnd;
    }

    public String getClientLastName() {
	return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
	this.clientLastName = clientLastName;
    }

    public String getClientFirstName() {
	return clientFirstName;
    }

    public void setClientFirstName(String clientFirstName) {
	this.clientFirstName = clientFirstName;
    }

    public boolean isPaid() {
	return isPaid;
    }

    public void setPaid(boolean isPaid) {
	this.isPaid = isPaid;
    }

    public User getUser() {
	return user;
    }

    public void setUser(User user) {
	this.user = user;
    }

    public Room getRoom() {
	return room;
    }

    public void setRoom(Room room) {
	this.room = room;
    }

    public Hotel getHotel() {
	return hotel;
    }

    public void setHotel(Hotel hotel) {
	this.hotel = hotel;
    }

}
